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
        <title>Edit product</title>
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
        
        <h1>Edit Product</h1>
        
        <c:if test="${products.productId!=0}">
		      Update Product for productId: <c:out value="${products.productId}"/>
		      <hidden path="productId"/>
	            </c:if>
        
        <form:form method="POST" action="${product.productId}" modelAttribute="products">
            <label type ="hidden" path="productId"></label>
            <input path="productId" type ="hidden"/>
            
            <label for="productName" path="productName">product name: </label>
            <input path="productName" name="productName" id="productName" type="text" maxlength="50" value="${products.productName}"/>
            <errors path="productName" class="error"></errors>
            
            <label for="description" path="description">description: </label>
            <input path="description" name="description" id="description" type="text" maxlenght="150" value="${products.description}"/>
             <errors path="description" class="error"></errors>
             
            <label for="price" path="price">price: </label>
            <input path="price" name="price" id="price" type="number" min="0.1" step="0.01" value="${products.price}"/>
            <errors path="price" class="error"></errors>
             
            <label for="imageUrl" path="imageUrl">imageUrl: </label>
            <input path="imageUrl" name="imageUrl" id="imageUrl" type="url" maxlength="200" value="${products.imageUrl}"/>
             <errors path="imageUrl" class="error"></errors>
            
            <label for="category" path="category">category: </label>
            <select path="category" id="category" name="categoryId">
                <c:forEach items="${category}" var="c">
                <option selected="${productCategory.categoryId}" value="${productCategory.categoryId}">${productCategory.categoryName}</option>
            </c:forEach>
            </select>
            
            <label for="brands" path="brands">brand: </label>
            <select path="brands" id="brands" name="brandId">
                <c:forEach items="${brands}" var="b">
                <option selected="${productBrand.brandId}" value="${productBrand.brandId}">${productBrand.brandName}</option>
            </c:forEach>
            </select>
            
             <c:if test="${products.productId!=0}">
			       <button type="submit" value="update/${product.productId}">Submit</button>
	         </c:if>
            
            
        </form:form>
            
     </body>
</html>

