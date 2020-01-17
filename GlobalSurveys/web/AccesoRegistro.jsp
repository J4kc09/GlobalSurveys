<%-- 
    Document   : HacerEncuesta
    Created on : 14-ene-2020, 19:23:18
    Author     : Articuno
--%>


<%@page import="GlobalSurveys.Entity.SesionPreguntas"%>
<%@page import="GlobalSurveys.Entity.Sesion"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta</title>
    </head>
    <%
        Sesion sesion = (Sesion)request.getAttribute("id");       
    %>  
   
    <body>
        <h1><%= sesion.getIdSesion()%></h1>
        
            
            Sesiones Con Preguntas y Respuestas
                         
        <table>
           <%
                    for (SesionPreguntas ses:sesion.getSesionPreguntasList()) {
                     %>
                      <tr><%= ses.getPregunta()%> <br/>
                      <tr><%= ses.getIdRespuesta() %> <br/>
                    
                         <br/> 
                         <br/>   
                   <%  }
                         %>
    </table>
        <button onclick="history.back()">Volver</button>
    </body>
</html>