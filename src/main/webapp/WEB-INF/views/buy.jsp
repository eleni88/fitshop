<%-- 
    Document   : buy
    Created on : Nov 4, 2019, 2:38:19 AM
    Author     : Eleni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">

            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link " href="/fitshop">Home </a>
                    <a class="nav-item nav-link" href="/fitshop/products">Products</a>
                    <a class="nav-item nav-link" href="/fitshop/brands">Brands</a>
                    <a class="nav-item nav-link " href="/fitshop/category">Category</a>
                </div>
            </div>
        </nav>
        
        <table>
            <thead>

            <th type="hidden" value="productId"></th>
            <th>productName</th>
            <th>description</th>
            <th>price</th>
            <th>imageUrl</th>
            <th>quantity</th><th></th>


        </thead>
        <tbody>
           

                <tr>
                    <td value="${products.productId}" type="hidden"/></td>
                    <td><c:out value="${products.productName}"/></td>
                    <td><c:out value="${products.description}"/></td>
                    <td><c:out value="${products.price}"/></td>
                    <td><c:out value="${products.imageUrl}"/></td>
                    <td><input type="number" name="quantity" min="1" value="1">

                    </td>

                        <td><a href="/fitshop/products/buy/${products.productId}">Buy</a></td>


                </tr>
           
    </tbody>
</table>
        
    </body>
</html>
