<%-- 
    Document   : brands
    Created on : Sep 21, 2019, 3:39:37 AM
    Author     : Eleni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>category</title>
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
        
        ${category}
    </body>
</html>
