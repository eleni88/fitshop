/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.dao.CategoryDao;
import com.mycompany.fitshop.entities.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Eleni
 */
@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao dao;
    
    @Override
    public List<Category> findAllCategories() {
        return dao.findAllCategories();
    }

    @Override
    public Category findCategoryById(int id) {
       return dao.findCategoryById(id);
    }

    @Override
    public void saveCategory(Category category) {
        dao.saveCategory(category);
    }

    @Override
    public void deleteCategoryById(int id) {
        dao.deleteCategoryById(id);
    }
    
}
