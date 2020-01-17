<%-- 
    Document   : admin.jsp
    Created on : 08-ene-2020, 19:18:01
    Author     : Articuno
--%>


<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
        List<Encuesta> lista = (List)request.getAttribute("listado");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel Admin</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">PANEL DE ADMINISTRADOR</h1></span>
        <fieldset>
        <legend>ENCUESTAS</legend>
        <table>
        <%
         for (Encuesta encuesta: lista) {
        %>
        <tr>     
            <td><%= encuesta.getNomEncuesta() %></td>
            <td><button onclick="window.location.href = 'ServletPreguntasInsertar?id=<%=encuesta.getIdEncuesta()%>';">Definir preguntas</button>
            <td><button onclick="window.location.href = 'ServletEncuestaEditar?id=<%= encuesta.getIdEncuesta()%>';">Editar</button>                               
            <td><button onclick="window.location.href = 'ServletEncuestaBorrar?id=<%= encuesta.getIdEncuesta()%>';">Borrar</button>
        </tr>
            <%
                }
            %>       
        </table>
        </fieldset>
        <button class="boton" onclick="window.location.href = 'CrearEncuesta.jsp';">Crear nueva encuesta</button>
        <button class="boton" onclick="window.location.href = 'Preguntas';">Listado de preguntas</button>
        <button class="boton" onclick="window.location.href = 'Usuarios';">Usuarios</button>
        <button class="boton" onclick="window.location.href = 'Registros';">Registros</button>
        </div>
    </body>
</html>