<%-- 
    Document   : newproduct
    Created on : Sep 18, 2019, 3:19:57 PM
    Author     : Eleni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New product</title>
        <style>
	.error {
		color: #ff0000;
	}
</style>
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
        
        <h1>New Product</h1>
        
        <form:form method="POST" action="new" modelAttribute="products">
            <label type ="hidden" path="productId"></label>
            <input path="productId" type ="hidden"/>
            
            <label for="productName" path="productName">product name: </label>
            <input path="productName" name="productName" id="productName" type="text" maxlength="50"/>
            <errors path="productName" class="error"></errors>
            
            <label for="description" path="description">description: </label>
            <input path="description" name="description" id="description" type="text" maxlenght="150"/>
             <errors path="description" class="error"></errors>
             
            <label for="price" path="price">price: </label>
            <input path="price" name="price" id="price" type="number" min="0.1" step="0.01"/>
             <errors path="price" class="error"></errors>
             
            <label for="imageUrl" path="imageUrl">imageUrl: </label>
            <input path="imageUrl" name="imageUrl" id="imageUrl" type="url" maxlength="200"/>
             <errors path="imageUrl" class="error"></errors>
            
            <label for="category" path="category">category: </label>
            <select path="category" id="category" name="categoryId">
                <c:forEach items="${category}" var="c">
                <option value="${c.categoryId}">${c.categoryName}</option>
            </c:forEach>
            </select>
            
            <label for="brands" path="brands">brand: </label>
            <select path="brands" id="brands" name="brandId">
                <c:forEach items="${brands}" var="b">
                <option value="${b.brandId}">${b.brandName}</option>
            </c:forEach>
            </select>
            
            <button type="submit" value="new">Add</button>
        </form:form>
        
    </body>
</html>
