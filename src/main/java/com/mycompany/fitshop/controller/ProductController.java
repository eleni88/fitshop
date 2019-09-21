/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.controller;

import com.mycompany.fitshop.entities.Brand;
import com.mycompany.fitshop.entities.Category;
import com.mycompany.fitshop.entities.Product;
import com.mycompany.fitshop.service.BrandService;
import com.mycompany.fitshop.service.CategoryService;
import com.mycompany.fitshop.service.ProductService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Eleni
 */
@Controller
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService productservice;
    
    @Autowired
    CategoryService categoryService;
    
    @Autowired
    BrandService brandService;
    
 
    @RequestMapping(method = RequestMethod.GET)
    public String findAllProducts(ModelMap model){
    List<Product>products = productservice.findAllProducts();
    model.addAttribute("products", products);
    
    return "products";
        
    } 
    
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String insertProduct(ModelMap model){
    Product product = new Product();
    List<Category> category = categoryService.findAllCategories();
    List<Brand> brands = brandService.findAllBrands();
          
            model.addAttribute("category", category);
            model.addAttribute("brands", brands);
             model.addAttribute("products", product);
            return "newproduct";
    }
    
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String saveProduct(@RequestParam("categoryId") Integer categoryId, @RequestParam(value = "brandId") Integer brandId, @Valid Product product, BindingResult result, ModelMap model){
//    if(result.hasErrors()){
//    return "redirect:/products/new";
//    }
    Category category = categoryService.findCategoryById(categoryId);
    product.setCategoryId(category);
    Brand brand = brandService.findBrandById(brandId);
    product.setBrandId(brand);
    productservice.saveProduct(product);
    
    return "redirect:/products" ;
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable("id") Integer id, ModelMap model){
    productservice.deleteProductById(id);
    return "redirect:/products";
    }
    
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String editProduct(@PathVariable("id") Integer id, ModelMap model){
    Product product = productservice.findById(id);
      
          
    List<Category>category = categoryService.findAllCategories();
    List<Brand>brands = brandService.findAllBrands();
    
  
            model.addAttribute("category", category);
            model.addAttribute("brands", brands);
            model.addAttribute("productCategory", product.getCategoryId());
            model.addAttribute("productBrand", product.getBrandId());
            model.addAttribute("products", product);
            
    return "editproduct";
    }
    
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String saveEditProduct(@PathVariable("id") Integer id, @RequestParam("categoryId") Integer categoryId, @RequestParam("brandId") Integer brandId, @Valid Product product, BindingResult result, ModelMap model){
//    if(result.hasErrors()){
//    return "editproduct";
//    }
    Category category = categoryService.findCategoryById(categoryId);
    product.setCategoryId(category);
    Brand brand = brandService.findBrandById(brandId);
    product.setBrandId(brand);
    product.setProductId(id);
    productservice.updateProduct(product);
   
    return "redirect:/products";
        
    }
  
}
