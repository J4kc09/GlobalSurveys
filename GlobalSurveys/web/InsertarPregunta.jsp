<%-- 
    Document   : MeterPregunta
    Created on : Jan 14, 2020, 5:13:00 PM
    Author     : sergio13v
--%>

<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar preguntas</title>
        <%
        Encuesta encuesta = (Encuesta)request.getAttribute("encuesta");
        List<Pregunta> lista = (List)request.getAttribute("listado");
        %>
    </head>
    <body>
        <h1>Insertar preguntas</h1>
        <h2>Nombre de la encuesta</h2>
        <form action="ServletPreguntasInsertarGuardar">
        <input type="hidden" name="encuesta" value="<%= request.getParameter("id") %>">
        <fieldset>
        <table>

            <%
                for (Pregunta cliente: lista) {
            %>
            <tr>
                <td><input type="checkbox" name="id" value="<%= cliente.getIdPregunta() %>"><%= cliente.getPregunta() %></td>
            </tr>
            <%
                }
            %>    
        </table>
        </fieldset>
        <input type="submit" value="Enviar" />
        <input type="button" onclick="history.back()" name="volver" value="Volver">
        </form>
    </body>
</html>
