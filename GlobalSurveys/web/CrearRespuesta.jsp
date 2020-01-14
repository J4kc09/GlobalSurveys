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
        <title>Creador de Preguntas</title>
    </head>
     <%
        Pregunta pregunta = (Pregunta)request.getAttribute("pregunta");
     %>  
    <body>
        <form action="ServletRespuestaCrear2">
             <input type="hidden" name="pregunta" value="<%= request.getParameter("id")%>">
             <input type="hidden" name="idrespuesta" value="0" />
            CREADOR DE RESPUESTAS <br/> Enunciado de la respuesta:<input type="text" name="respuesta" value="" /> <br/>
             
           <input type="submit" value="Crear" />
        </form>
    </body>
</html>