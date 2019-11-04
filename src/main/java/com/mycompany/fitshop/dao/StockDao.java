/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Stock;
import java.util.List;

/**
 *
 * @author Eleni
 */
public interface StockDao {

    public List<Stock> findStock();

    public Stock findStockById(Integer id);

    public Stock findStockByProductId(Integer id);

    public void saveStock(Stock stock);

    public void updateStock(Stock stock);
}
