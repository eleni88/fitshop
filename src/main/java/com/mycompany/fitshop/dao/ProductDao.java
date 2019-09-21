/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Category;
import com.mycompany.fitshop.entities.Product;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface ProductDao {
    public List<Product> findAllProducts();
    public Product findById(int id);
    public void saveProduct(Product Product);
    public void deleteProductById(int id);
    public void updateProduct(Product product);
    public List<Product> findProductsByCategory(Category category);
    
}
