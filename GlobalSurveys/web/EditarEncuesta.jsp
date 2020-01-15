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
    </head>
    <%
        Encuesta encuesta = (Encuesta)request.getAttribute("encuesta");
    %>    
    <body>
        <h1>Editor de encuestas:</h1>
            <form action="ServletEncuestaGuardar">
            ID Encuesta: <%= encuesta.getIdEncuesta()%> <br>
            <input type="hidden" name="id" value="<%= encuesta.getIdEncuesta()%>" />
            Nombre:<input type="text" name="nombre" value="<%=encuesta.getNomEncuesta() %>" />
            Descripción:<input type="text" name="descripcion" value="<%=encuesta.getDescripcionEncuesta()%>" /><br/>  
            
            
            
            
           <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
