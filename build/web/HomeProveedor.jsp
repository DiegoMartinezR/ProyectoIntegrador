<%-- 
    Document   : HomeProveedor
    Created on : 11-oct-2018, 13:54:00
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Proveedor</title>
    </head>
    <body>
     <center><h2>Home Proveedor</h2></center>
     Welcome <%=request.getAttribute("userName") %> <!-- Refer to the video to understand how this works -->
     <div style="text-align: right"><a href="LogoutServlet">Logout</a></div>
    </body>
</html>
