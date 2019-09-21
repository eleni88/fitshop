<%-- 
    Document   : products
    Created on : Sep 18, 2019, 2:33:04 PM
    Author     : Eleni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categories</title>
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
       
        <h2>List of Categories</h2>
      <table>
            <thead>
		
			<th type="hidden" value="categoryId"></th>
                        <th>categoryName</th>
                       
                         
		
                </thead>
                <tbody>
		<c:forEach items="${category}" var="category">
                    
			<tr>
                            <td value="${category.categoryId}" type="hidden"/></td>
                            <td><c:out value="${category.categoryName}"/></td>
                            
                       
                       
                       
                        
			
			<td><a href="/fitshop/category/delete/${category.categoryId}">Delete</a></td>
			</tr>
		</c:forEach>
                <a href="/fitshop/category/newCategory">New</a>
                        </tbody>
	</table>

    </body>
</html>