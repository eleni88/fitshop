<%-- 
    Document   : products
    Created on : Sep 18, 2019, 2:33:04 PM
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
        <title>Products</title>
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

        <h2>List of Products</h2>
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
            <c:forEach items="${products}" var="product">

                <tr>
                    <td value="${product.productId}" type="hidden"/></td>
                    <td><c:out value="${product.productName}"/></td>
                    <td><c:out value="${product.description}"/></td>
                    <td><c:out value="${product.price}"/></td>
                    <td><c:out value="${product.imageUrl}"/></td>
                    <td><input type="number" name="quantity" min="1" value="1">

                    </td>






                    <sec:authorize access="hasRole('user')"><td><a href="/fitshop/products/addToCart/${product.productId}">Add to cart</a></td></sec:authorize>        
                    <sec:authorize access="hasRole('admin')"><td><a href="/fitshop/products/update/${product.productId}">Edit</a></td></sec:authorize>
                    <sec:authorize access="hasRole('admin')"><td><a href="/fitshop/products/delete/${product.productId}">Delete</a></td></sec:authorize>

                        <td><a href="/fitshop/products/buy/${product.productId}">Buy</a></td>


                </tr>
            </c:forEach>
            <sec:authorize access="hasRole('admin')"><a href="/fitshop/products/new">New</a></sec:authorize>
    </tbody>
</table>

</body>
</html>