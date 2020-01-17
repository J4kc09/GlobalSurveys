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
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
    <%
        List<Encuesta> lista = (List)request.getAttribute("listado");
    %>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">LISTADO DE ENCUESTAS</h1></span>
        <form action="ServletEncuestaHacer">
        <fieldset>
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
        </fieldset>
        </form>
        </div>
    </body>
</html>