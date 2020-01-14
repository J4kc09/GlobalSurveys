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
        <h1>Listado de clientes</h1>
        <table>
            <%
                for (Encuesta cliente: lista) {
            %>
            <tr>
                <td><%= cliente.getNomEncuesta()%></td>
                <td><%= cliente.getDescripcionEncuesta() %></td>
                <td><button onclick="window.location.href = 'ServletEncuestasHacer?id=<%= cliente.getIdEncuesta()%>';">Hacer Encuesta</button>                                          
            </tr>
            <%
                }
            %>    
        </table>
    </body>
</html>
