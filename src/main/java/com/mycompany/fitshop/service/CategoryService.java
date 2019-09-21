/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.entities.Category;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface CategoryService {
   List<Category> findAllCategories();
   Category findCategoryById(int id);
   void saveCategory(Category category);
   void deleteCategoryById(int id);
}
