/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.controller;

import com.mycompany.fitshop.service.BrandService;
import com.mycompany.fitshop.service.CategoryService;
import com.mycompany.fitshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Eleni
 */
@Controller
@RequestMapping("/")
public class AppController {
    
    @Autowired
    CategoryService categoryService;
    
    @Autowired
    BrandService brandService;
    
    @Autowired
    ProductService productservice;
    
    @RequestMapping(value = ("/"), method = RequestMethod.GET)
    public String Home(ModelMap model){
       
       return "home";
    }
}
