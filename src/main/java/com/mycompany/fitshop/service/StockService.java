/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.entities.Product;
import com.mycompany.fitshop.entities.Stock;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface StockService {
    List<Stock> findStock();
    Stock findStockById(Integer id);
    Stock findStockByProductId(Integer id);
    void saveStock(Stock stock);
    void updateStock(Stock stock);
   
    void saveProductIntoStock( Integer quantity, Product product);
}
