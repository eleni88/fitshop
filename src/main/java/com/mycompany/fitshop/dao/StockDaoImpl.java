/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.dao;

import com.mycompany.fitshop.entities.Product;
import com.mycompany.fitshop.entities.Stock;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eleni
 */
@Repository("StockDao")
@Transactional
public class StockDaoImpl extends AbstractDao<Integer, Stock> implements StockDao{

    @Override
    @SuppressWarnings("unchecked")
    public List<Stock> findStock() {
        Criteria criteria = createEntityCriteria();
        return (List<Stock>) criteria.list();
    }

    @Override
    public Stock findStockById(Integer id) {
       return getByKey(id);
    }

    @Override
    public Stock findStockByProductId(Integer id) {
        Criteria criteria = createEntityCriteria();
        //criteria.add(Restrictions.eq("productId", id));
        Criterion productId = Restrictions.eq("productId", id);
       criteria.setMaxResults(1);
       return (Stock) criteria.uniqueResult();
    }

    @Override
    public void saveStock(Stock stock) {
        persist(stock);
        
    }

    @Override
    public void updateStock(Stock stock) {
        Stock entity = findStockById(stock.getStockId());
        if (entity!=null){
        entity.setProductId(stock.getProductId());
        entity.setQuantity(stock.getQuantity());
        }
    }
    
}
