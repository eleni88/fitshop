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
        <title>New category</title>
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
        
        <h1>New Category</h1>
        
        <form:form method="POST" action="newCategory" modelAttribute="category">
            <label type ="hidden" path="categoryId"></label>
            <input path="categoryId" type ="hidden"/>
            
            <label for="categoryName" path="categoryName">category name: </label>
            <input path="categoryName" name="categoryName" id="categoryName" type="text" maxlength="50"/>
            <errors path="categoryName" class="error"></errors>
            
           
            <button type="submit" value="newCategory">Add</button>
        </form:form>
        
    </body>
</html>
