/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.UserProfile;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface UserProfileDao {
    
     List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(Integer id);
    
}
