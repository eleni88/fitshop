/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Category;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eleni
 */
@Repository("CategoryDao")
@Transactional
public class CategoryDaoImpl extends AbstractDao<Integer, Category> implements CategoryDao {

    @Override
    public List<Category> findAllCategories() {
        Criteria criteria = createEntityCriteria();
        return  (List<Category>) criteria.list();
    }
    
    @Override
    public Category findCategoryById(int id){
    return getByKey(id);
    }
    
    @Override
    public void saveCategory(Category category){
    persist(category);
    }
    
     @Override
     public void deleteCategoryById(int id){
     delete(findCategoryById(id));
     }
     
   
    
}
