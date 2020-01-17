<%-- 
    Document   : EditarEncuesta
    Created on : 14-ene-2020, 11:24:18
    Author     : ilariadot
--%>

<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editor de encuestas</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
    <%
        Encuesta encuesta = (Encuesta)request.getAttribute("encuesta");
    %>    
    <body>
        <div>
            <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">EDITOR DE ENCUESTAS</h1></span>
            <form action="ServletEncuestaGuardar">
            <fieldset>
            <legend>ID Encuesta: <%= encuesta.getIdEncuesta()%> </legend>
            <input type="hidden" name="id" value="<%= encuesta.getIdEncuesta()%>" />
            Nombre:<input class="input1" type="text" name="nombre" value="<%=encuesta.getNomEncuesta() %>" />
            Descripción:<input class="input1" type="text" name="descripcion" value="<%=encuesta.getDescripcionEncuesta()%>" /><br/>  
            </fieldset>
           <input type="submit" value="Enviar" />
           <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>