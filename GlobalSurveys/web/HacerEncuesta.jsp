<%-- 
    Document   : HacerEncuesta
    Created on : 14-ene-2020, 19:23:18
    Author     : Articuno
--%>

<%@page import="GlobalSurveys.Entity.Respuesta"%>
<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta</title>
    </head>
    <%
        Encuesta encuesta = (Encuesta)request.getAttribute("idencuesta");       
    %>  
    <script>
function myFunction() {
  document.getElementById("demo").style.color = "red";
}
</script>
    <body>
        <h1><%= encuesta.getNomEncuesta() %></h1>
        <form action="ServletEncuestaEnviar">
            <input type="hidden" name="idencuesta" value="<%= encuesta.getIdEncuesta() %>">
            <br>
            Preguntas:
                         
        <table>
           <%
                    for (Pregunta preg:encuesta.getPreguntaList()) {
                     %>
                     
                     <%= preg.getPregunta() %> <br/>
                     <%
                         for (Respuesta res:preg.getRespuestaList()) {
                     %>
                     
                    
                     <input type="radio" name="<%= preg.getIdPregunta()%>" value="<%= res.getIdRespuesta() %>"/>
                     <%= res.getRespuesta() %>  <br/>                 
  
                 <%
                       } %>
                         <br/> 
                         <br/>   
                   <%  }
                         %>
        </table>
        <input type="submit" value="Enviar" />
        </form>
        <button onclick="history.back()">Volver</button>
    </body>
</html>