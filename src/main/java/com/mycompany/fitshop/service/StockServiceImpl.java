/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.service;

import com.mycompany.fitshop.dao.ProductDao;
import com.mycompany.fitshop.dao.StockDao;
import com.mycompany.fitshop.entities.Product;
import com.mycompany.fitshop.entities.Stock;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Eleni
 */
@Service("StockService")
@Transactional
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDao dao;
    
    
    @Override
    public List<Stock> findStock() {
       return dao.findStock();
    }

    @Override
    public Stock findStockById(Integer id) {
        return dao.findStockById(id);
    }

    @Override
    public Stock findStockByProductId(Integer id) {
       return dao.findStockByProductId(id);
    }

    @Override
    public void saveStock(Stock stock) {
        dao.saveStock(stock);
    }

    @Override
    public void updateStock(Stock stock) {
        dao.updateStock(stock);
    }
    
    
    public void saveProductIntoStock( Integer quantity, Product product){
        
    dao.saveStock(new Stock(quantity, product));
    }
    
}
