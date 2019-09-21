/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.controller;

import com.mycompany.fitshop.entities.Category;
import com.mycompany.fitshop.service.CategoryService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Eleni
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    CategoryService categoryService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String findAllCategories(ModelMap model){
        List<Category>category = categoryService.findAllCategories();
    model.addAttribute("category", category);
    return "category";
    }
    
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public String findCategoryById(@PathVariable("id") Integer id, ModelMap model){
//    Category category = categoryService.findCategoryById(id);
//    model.addAttribute("category", category);
//    return "";
//    }
    
    @RequestMapping(value = "/newCategory", method = RequestMethod.GET)
    public String insertCategory(ModelMap model){
    Category category = new Category();
    model.addAttribute("category", category);
    return"newcategory";
    }
    
    @RequestMapping(value = "/newCategory", method = RequestMethod.POST)
    public String saveCategory(@Valid Category category, BindingResult result, ModelMap model){
    if(result.hasErrors()){
    return"newcategory";
    }
    categoryService.saveCategory(category);
    return"redirect:/category";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteCategory(@PathVariable("id") Integer id, ModelMap model){
    categoryService.deleteCategoryById(id);
    return "redirect:/category";
    }
}
