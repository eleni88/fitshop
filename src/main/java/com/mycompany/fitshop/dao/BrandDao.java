/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Brand;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface BrandDao {
    public List<Brand> findAllBrands();
    public Brand findBrandById(int id);
    public void saveBrand(Brand brand);
    public void deleteBrandById(int id);
    
}
