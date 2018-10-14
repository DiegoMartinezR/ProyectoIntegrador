<%-- 
    Document   : RegistroP
    Created on : 11-oct-2018, 14:03:50
    Author     : DIEGO
--%>
<pre><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
<script>
function validate()
{
var nombres = document.form.nombre.value;
var email = document.form.email.value;
var ruc = document.form.ruc.value;
var password = document.form.password.value;
var conpassword= document.form.conpassword.value;

if (nombres==null || nombres=="")
{
alert("Nombre no puede estar en blanco");
return false;
}
else if (email==null || email=="")
{
alert("Email no puede estar en blanco");
return false;
}
else if (ruc==null || ruc=="")
{
alert("Ruc no puede estar en blanco");
return false;
}
else if(password.length<6)
{
alert("Por favor ingrese una contraseña mayor a 6 caracteres.");
return false;
}
else if (password!=conpassword)
{
alert("La confimación de la contraseña no coincide");
return false;
}
}
</script>
</head>
<body>
<center><h2>Registro de Proveedor</h2></center>
<form name="form" action="RegistroServletP" method="post" onsubmit="return validate()">
<table align="center">
<tr>
    <td>Nombre Empresa</td>
    <td><input type="text" name="nombre" /></td>
</tr>
<tr>
    <td>Ruc</td>
    <td><input type="text" name="ruc" /></td>
</tr>
<tr>
    <td>Email</td>
    <td><input type="text" name="email" /></td>
</tr>
<tr>
    <td>Password</td>
    <td><input type="password" name="password" /></td>
</tr>
<tr>
    <td>Confirm Password</td>
    <td><input type="password" name="conpassword" /></td>
</tr>
<tr>
    <td><input type="hidden" name="tipo" value="proveedor"/></td>
</tr>
<tr>
    <td><%=(request.getAttribute("errMessage") == null) ? ""
    : request.getAttribute("errMessage")%></td>
</tr>
<tr>
    <td><input type="hidden" name="tipo" value="proveedor"/></td>
</tr>
<tr>
    <td></td>
    <td><input type="submit" value="Register"></input><input
    type="reset" value="Reset"></input></td>
</tr>
</table>
</form>
 
</body>
</html>