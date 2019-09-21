/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Brand;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eleni
 */
@Repository("BrandDao")
@Transactional
public class BrandDaoImpl extends AbstractDao<Integer, Brand> implements BrandDao {

    @Override
    public List<Brand> findAllBrands() {
        Criteria criteria = createEntityCriteria();
        return (List<Brand>) criteria.list();
    }

    @Override
    public Brand findBrandById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveBrand(Brand brand) {
        persist(brand);
    }

    @Override
    public void deleteBrandById(int id) {
        delete(findBrandById(id));
    }
    
}
