<%-- 
    Document   : Home
    Created on : 02-oct-2018, 6:29:19
    Author     : DIEGO
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Cliente</title>
</head>
<body>
 <center><h2>Home Cliente</h2></center>
 Welcome <%=request.getAttribute("userName") %> <!-- Refer to the video to understand how this works -->
 <div style="text-align: right"><a href="LogoutServlet">Logout</a></div>
</body>
</html>
