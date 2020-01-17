<%-- 
    Document   : CrearUsuario
    Created on : Jan 10, 2020, 6:09:56 PM
    Author     : sergio13v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creador de usuarios</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">CREADOR DE USUARIOS</h1></span>
        <form action="ServletUsuarioCrear">
            <fieldset>
             <input type="hidden" name="id" value="0" />
            Usuario:<input class="input1" type="text" name="nombreUsuario" value="" /> <br/>
            Contraseña:<input class="input1" type="password" name="passwordUsuario" value="" /> <br/>
            Este usuario es administrador:<br/>
            <input type="radio" name="adminUsuario" value="true"> Si<br/>
            <input type="radio" name="adminUsuario" value="false"> No<br/>
            </fieldset>        
           <input type="submit" value="Enviar" />
           <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>