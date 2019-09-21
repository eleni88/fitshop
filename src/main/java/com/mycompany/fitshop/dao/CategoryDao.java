/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Category;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface CategoryDao {
    public List<Category> findAllCategories();
    public Category findCategoryById(int id);
    public void saveCategory(Category category);
    public void deleteCategoryById(int id);
   ;
}
