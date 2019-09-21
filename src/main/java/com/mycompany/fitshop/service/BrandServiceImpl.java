/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.dao.BrandDao;
import com.mycompany.fitshop.entities.Brand;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Eleni
 */
@Service("BrandService")
public class BrandServiceImpl implements BrandService {
    
    @Autowired
    private BrandDao dao;

    @Override
    public List<Brand> findAllBrands() {
       return dao.findAllBrands();
    }

    @Override
    public Brand findBrandById(int id) {
        return dao.findBrandById(id);
    }

    @Override
    public void saveBrand(Brand brand) {
        dao.saveBrand(brand);
    }

    @Override
    public void deleteBrandById(int id) {
        dao.deleteBrandById(id);
    }
    
}
