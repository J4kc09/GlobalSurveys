<%-- 
    Document   : CrearPregunta
    Created on : 08-ene-2020, 20:23:23
    Author     : Articuno
--%>


<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creador de respuestas</title>
    </head>
     <%
        Pregunta pregunta = (Pregunta)request.getAttribute("pregunta");
     %>  
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">CREADOR DE RESPUESTAS</h1></span>
        <form action="ServletRespuestaCrear">
            <fieldset
             <input type="hidden" name="pregunta" value="<%= request.getParameter("id")%>">
             <input type="hidden" name="idrespuesta" value="0" />
             Enunciado de la respuesta:<input class="input1" type="text" name="respuesta" value="" /> <br/>
            </fieldset>
           <input type="submit" value="Crear" />
           <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>