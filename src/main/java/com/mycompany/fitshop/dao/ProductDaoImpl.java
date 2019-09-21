/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Category;
import com.mycompany.fitshop.entities.Product;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eleni
 */
@Repository("ProductDao")
@Transactional
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements ProductDao {

    @Override
    @SuppressWarnings("unchecked")
    public List<Product> findAllProducts() {
        Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
    }

    @Override
    public Product findById(int id) {
       return getByKey(id);
    }

    @Override
    public void saveProduct(Product product) {
        persist(product);
    }

    @Override
    public void deleteProductById(int id) {
        delete(findById(id));
    }
    
    @Override
    public void updateProduct(Product product){
     Product entity = findById(product.getProductId());
       if (entity != null){
       entity.setProductName(product.getProductName());
       entity.setDescription(product.getDescription());
       entity.setPrice(product.getPrice());
       entity.setImageUrl(product.getImageUrl());
       entity.setBrandId(product.getBrandId());
       entity.setCategoryId(product.getCategoryId());
       }
    }

    @Override
    public List<Product> findProductsByCategory(Category category) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("category", category));
        return criteria.list();
    }
    
}
