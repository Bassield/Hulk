/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaddy.web.services;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.shaddy.ejb.business.domain.Product;
import org.shaddy.ejb.business.services.ProductManagerBeanLocal;

/**
 *
 * @author Ayanda
 */
@WebService(serviceName = "ShaddyStoreServices")
public class ShaddyStoreServices {
    @EJB
    private ProductManagerBeanLocal productManager;

    @WebMethod(operationName = "findByProductCode")
    public Product findByProductCode(@WebParam(name = "prodCode") String prodCode) {
        return productManager.findByProductCode(prodCode);
    }

    @WebMethod(operationName = "retrieveListOfProducts")
    public List<Product> retrieveListOfProducts() {
        return productManager.retrieveListOfProducts();
    }
}
