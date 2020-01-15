<%-- 
    Document   : UsuarioVerEncuestas
    Created on : 14-ene-2020, 17:13:01
    Author     : Articuno
--%>

<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        List<Encuesta> lista = (List)request.getAttribute("listado");
    %>
    <body>
        <h1>Listado de Encuestas</h1>
        <form action="ServletEncuestaHacer">
        <table>
            <%
                for (Encuesta cliente: lista) {
            %>
            <tr>
                <td><%= cliente.getNomEncuesta()%></td>
                <td><%= cliente.getDescripcionEncuesta() %></td>
                <td><a href='ServletEncuestaHacer?id=<%= cliente.getIdEncuesta()%>'>Hacer Encuesta</a>
                    
            </tr>
            <%
                }
            %>    
        </table>
        </form>
    </body>
</html>
