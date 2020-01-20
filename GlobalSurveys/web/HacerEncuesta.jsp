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
        <link rel="stylesheet" type="text/css" href="Styles.css">
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
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto"><h1><%= encuesta.getNomEncuesta() %></h1></h1></span>
        <form action="ServletEncuestaEnviar">
            <fieldset>
            <legend>PREGUNTAS</legend>
            <input type="hidden" name="idencuesta" value="<%= encuesta.getIdEncuesta() %>">
            <br>
                         
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
        </fieldset>
        <input type="submit" value="Enviar" />
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>