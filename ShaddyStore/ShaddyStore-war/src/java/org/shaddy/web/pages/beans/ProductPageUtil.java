/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaddy.web.pages.beans;

import org.shaddy.web.services.client.ShaddyStoreServices;
import org.shaddy.web.services.client.ShaddyStoreServices_Service;


/**
 *
 * @author Ayanda
 */
public class ProductPageUtil {
    
    public static java.util.List<org.shaddy.web.services.client.Product> retrieveListOfProducts() {
        ShaddyStoreServices_Service service = new ShaddyStoreServices_Service();
        ShaddyStoreServices port = service.getShaddyStoreServicesPort();
        return port.retrieveListOfProducts();
    }
}
