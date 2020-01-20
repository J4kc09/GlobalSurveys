<%-- 
    Document   : UsuarioVerEncuestas
    Created on : 14-ene-2020, 17:13:01
    Author     : Articuno
--%>

<%@page import="GlobalSurveys.Entity.Sesion"%>
<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        List<Sesion> listasesion = (List)request.getAttribute("listadosesion");
    %>
    <body>
        <h1>Listado de sesiones</h1>
        <form action="ServletVerRegistro">
        <table>
            <%
                for (Sesion cliente: listasesion) {
            %>
            <tr>
                <td>ID DE USUARIO: <%= cliente.getIdUsuario() %></td>
                <td>FECHA DE LA SESION: <%= cliente.getFecha() %></td>
                <td>ID DE LA ENCUESTA: <%= cliente.getIdEncuesta() %></td>
                <td><a href='ServletSesionPreguntas?id=<%= cliente.getIdSesion() %>'>Revisar Preguntas y Respuestas</a>
                    
            </tr>
            <%
                }
            %>    
        </table>
        </form>
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
    </body>
</html>