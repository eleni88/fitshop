/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.entities.Brand;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface BrandService {
    List<Brand> findAllBrands();
    Brand findBrandById(int id);
    void saveBrand(Brand brand);
    void deleteBrandById(int id);
    
}
