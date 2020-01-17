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
        <form action="ServletRespuestaCrear">
             <input type="hidden" name="pregunta" value="<%= request.getParameter("id")%>">
             <input type="hidden" name="idrespuesta" value="0" />
            CREADOR DE RESPUESTAS <br/> Enunciado de la respuesta:<input type="text" name="respuesta" value="" /> <br/>
             
           <input type="submit" value="Crear" />
        </form>
        <button onclick="history.back()">Volver</button>
    </body>
</html>