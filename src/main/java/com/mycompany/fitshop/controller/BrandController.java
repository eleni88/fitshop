/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.controller;

import com.mycompany.fitshop.entities.Brand;
import com.mycompany.fitshop.service.BrandService;
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
@RequestMapping("/brands")
public class BrandController {
    
    @Autowired
    BrandService brandService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String findAllBrands(ModelMap model){
        List<Brand>brands = brandService.findAllBrands();
    model.addAttribute("brands", brands);
    return"brands";
    }
    
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public String findBrandById(@PathVariable("brandId") Integer brandId, ModelMap model){
//    Brand brand = brandService.findBrandById(brandId);
//    model.addAttribute("brands", brand);
//    return"";
//    }
    
    @RequestMapping(value = "/newBrand", method = RequestMethod.GET)
    public String insertBrand(ModelMap model){
    Brand brand = new Brand();
    model.addAttribute("brands", brand);
    return"newbrand";
    }
    
    @RequestMapping(value = "/newBrand", method = RequestMethod.POST)
    public String saveBrand(@Valid Brand brand, BindingResult result, ModelMap model){
        if(result.hasErrors()){
        return "newbrand";
        }
    brandService.saveBrand(brand);
    return "redirect:/brands";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBrand(@PathVariable("id") Integer id, ModelMap model){
    brandService.deleteBrandById(id);
    
    return "redirect:/brands";
    }   
}
