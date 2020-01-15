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
        <title>JSP Page</title>
    </head>
    <%
        Encuesta encuesta = (Encuesta)request.getAttribute("idencuesta");
        List<Pregunta> listapreguntas = (List) request.getAttribute("listapreguntas");
        List<Respuesta> listarespuestas = (List) request.getAttribute("listarespuestas");
        
    %>  
    <body>
        <h1>ENCUESTA</h1>
        <form action="ServletEncuestaEnviar">
            Nombre de la Encuesta <%= encuesta.getNomEncuesta() %> <br>
            Preguntas:
                         
        <table>
           <%
                    for (Pregunta preg:listapreguntas) {
                     %>
                     
  <option value="<%= preg.getIdPregunta()%>">
      <%= preg.getPregunta()%>
  <%for (Respuesta resp:listarespuestas) {
      if (resp.getIdPregunta().equals(preg.getIdPregunta())) {
                        
                     %>                       
  <option value="<%= preg.getIdPregunta()%>">
      <%= preg.getPregunta()%>
  
  </option>
  
                 <%
                     }
                 %>
        </table>
        <input type="submit" value="Enviar" />
        </form>
    </body>
</html>