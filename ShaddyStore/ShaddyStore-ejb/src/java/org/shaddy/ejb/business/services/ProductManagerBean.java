/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaddy.ejb.business.services;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.shaddy.ejb.business.domain.Product;

/**
 *
 * @author Ayanda
 */
@Stateless
public class ProductManagerBean implements ProductManagerBeanLocal {
   
    @PersistenceContext(unitName = "ShaddyStore-ejbPU")
    private EntityManager em;
    
    @Override
    public Product findByProductCode(String prodCode) {
        return em.find(Product.class, prodCode);
    }
    
    @Override
    public List<Product> retrieveListOfProducts() {
        return em.createNamedQuery("Product.findAll").getResultList();
    }
}
