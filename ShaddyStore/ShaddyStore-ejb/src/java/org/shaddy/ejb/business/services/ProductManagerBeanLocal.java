/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaddy.ejb.business.services;

import java.util.List;
import javax.ejb.Local;
import org.shaddy.ejb.business.domain.Product;

/**
 *
 * @author Ayanda
 */
@Local
public interface ProductManagerBeanLocal {
    
    public Product findByProductCode(String prodCode);
    public List<Product> retrieveListOfProducts();
}
