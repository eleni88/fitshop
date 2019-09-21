/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.entities.Product;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface ProductService {
    List<Product> findAllProducts();
    Product findById(int id);
    void saveProduct(Product product);
    void deleteProductById(int id);
    void updateProduct(Product product);
}
