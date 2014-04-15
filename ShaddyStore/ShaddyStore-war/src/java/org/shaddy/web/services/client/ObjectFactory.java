
package org.shaddy.web.services.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.shaddy.web.services.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Manufacturer_QNAME = new QName("http://services.web.shaddy.org/", "manufacturer");
    private final static QName _FindByProductCode_QNAME = new QName("http://services.web.shaddy.org/", "findByProductCode");
    private final static QName _ProductCode_QNAME = new QName("http://services.web.shaddy.org/", "productCode");
    private final static QName _Product_QNAME = new QName("http://services.web.shaddy.org/", "product");
    private final static QName _RetrieveListOfProductsResponse_QNAME = new QName("http://services.web.shaddy.org/", "retrieveListOfProductsResponse");
    private final static QName _FindByProductCodeResponse_QNAME = new QName("http://services.web.shaddy.org/", "findByProductCodeResponse");
    private final static QName _RetrieveListOfProducts_QNAME = new QName("http://services.web.shaddy.org/", "retrieveListOfProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.shaddy.web.services.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductCode }
     * 
     */
    public ProductCode createProductCode() {
        return new ProductCode();
    }

    /**
     * Create an instance of {@link Manufacturer }
     * 
     */
    public Manufacturer createManufacturer() {
        return new Manufacturer();
    }

    /**
     * Create an instance of {@link FindByProductCode }
     * 
     */
    public FindByProductCode createFindByProductCode() {
        return new FindByProductCode();
    }

    /**
     * Create an instance of {@link RetrieveListOfProducts }
     * 
     */
    public RetrieveListOfProducts createRetrieveListOfProducts() {
        return new RetrieveListOfProducts();
    }

    /**
     * Create an instance of {@link FindByProductCodeResponse }
     * 
     */
    public FindByProductCodeResponse createFindByProductCodeResponse() {
        return new FindByProductCodeResponse();
    }

    /**
     * Create an instance of {@link RetrieveListOfProductsResponse }
     * 
     */
    public RetrieveListOfProductsResponse createRetrieveListOfProductsResponse() {
        return new RetrieveListOfProductsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "manufacturer")
    public JAXBElement<Manufacturer> createManufacturer(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_Manufacturer_QNAME, Manufacturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByProductCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "findByProductCode")
    public JAXBElement<FindByProductCode> createFindByProductCode(FindByProductCode value) {
        return new JAXBElement<FindByProductCode>(_FindByProductCode_QNAME, FindByProductCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "productCode")
    public JAXBElement<ProductCode> createProductCode(ProductCode value) {
        return new JAXBElement<ProductCode>(_ProductCode_QNAME, ProductCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveListOfProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "retrieveListOfProductsResponse")
    public JAXBElement<RetrieveListOfProductsResponse> createRetrieveListOfProductsResponse(RetrieveListOfProductsResponse value) {
        return new JAXBElement<RetrieveListOfProductsResponse>(_RetrieveListOfProductsResponse_QNAME, RetrieveListOfProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByProductCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "findByProductCodeResponse")
    public JAXBElement<FindByProductCodeResponse> createFindByProductCodeResponse(FindByProductCodeResponse value) {
        return new JAXBElement<FindByProductCodeResponse>(_FindByProductCodeResponse_QNAME, FindByProductCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveListOfProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.shaddy.org/", name = "retrieveListOfProducts")
    public JAXBElement<RetrieveListOfProducts> createRetrieveListOfProducts(RetrieveListOfProducts value) {
        return new JAXBElement<RetrieveListOfProducts>(_RetrieveListOfProducts_QNAME, RetrieveListOfProducts.class, null, value);
    }

}
