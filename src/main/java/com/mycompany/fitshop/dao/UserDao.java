/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.AppUser;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface UserDao {
    
    AppUser findById(int id);
     
    AppUser findBySSO(String sso);
     
    void save(AppUser user);
     
    void deleteBySSO(String sso);
     
    List<AppUser> findAllUsers();
 
    
}
