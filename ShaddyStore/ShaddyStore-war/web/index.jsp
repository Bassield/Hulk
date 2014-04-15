<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : Apr 12, 2014, 5:15:16 PM
    Author     : Ayanda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="product" scope="session" class="org.shaddy.web.pages.beans.ProductPageBean" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Funny looking shady store web application</title>
    </head>
    <body>
        <h4>List of All Available Products</h4>
        <table>
            <thead>
                <td>Code</td>
                 <td>Description</td>
                  <td>Price</td>
                   <td>Availability</td>
            </thead>
            <c:forEach var="prod" items="${product.listOfProducts}">
                <tr>
                    <td><c:out value="${prod.productCode.prodCode}"/></td>
                    <td><c:out value="${prod.description}"/></td>
                    <td><c:out value="${prod.purchaseCost}"/></td>
                    <td><c:out value="${prod.available}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
