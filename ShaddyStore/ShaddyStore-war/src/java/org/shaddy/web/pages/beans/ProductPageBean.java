/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaddy.web.pages.beans;

import java.util.List;
import org.shaddy.web.services.client.Product;

/**
 *
 * @author Ayanda
 */
public class ProductPageBean {

    private Product product;
    private List<Product> listOfProducts;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getListOfProducts() {
        listOfProducts = ProductPageUtil.retrieveListOfProducts();
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
}
