<%-- 
    Document   : Login
    Created on : 08-ene-2020, 20:24:24
    Author     : Articuno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GlobalSurveys - Login</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
   <body>        
    <div align="center">
    <img src="https://karrasko.ddns.net/assets/globalsurveys.png" alt="GlobalSurveys logo" height="200">
    <% 
    String error = (String)request.getAttribute("error");
    if (error == null) error = "";
    %>  
            <form action ="Login">

                <input type ="text" name="user" placeholder="Nombre de usuario"/><br>
                <input type="password" name="pass" placeholder="Contraseña"/><br>
                <input type="submit" value="Iniciar sesión">
                   
            </form>
            <p style="color: red"><%=error%></p>
       </div> 
       <footer class="footer">Copyright © 2020 GlobalSurveys</footer>
   </body>
</html>