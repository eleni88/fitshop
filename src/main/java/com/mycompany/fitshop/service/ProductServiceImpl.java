/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.dao.ProductDao;
import com.mycompany.fitshop.entities.Product;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Eleni
 */
@Service("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductDao dao;

    @Override
    public List<Product>findAllProducts() {
       return dao.findAllProducts();
    }

    @Override
    public Product findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveProduct(Product product) {
        dao.saveProduct(product);
    }

    @Override
    public void deleteProductById(int id) {
       dao.deleteProductById(id);
    }

//    @Override
//    public void updateProduct(Product product) {
//       Product entity = dao.findById(product.getProductId());
//       if (entity != null){
//       entity.setProductName(product.getProductName());
//       entity.setDescription(product.getDescription());
//       entity.setPrice(product.getPrice());
//       entity.setImageUrl(product.getImageUrl());
//       entity.setBrandId(product.getBrandId());
//       entity.setCategoryId(product.getCategoryId());
//       }
//    }
    
    @Override
    public void updateProduct(Product product){
    dao.updateProduct(product);
    }
    
}
