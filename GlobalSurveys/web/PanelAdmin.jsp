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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel Admin</title>
        <%
        List<Encuesta> lista = (List)request.getAttribute("listado");
        %>

    </head>
    <body>
        <h1>Panel Admin</h1>
        <fieldset>
    <legend>Encuestas</legend>

            <table>
            <%
                for (Encuesta encuesta: lista) {
            %>
            <tr>
                    
                <td><%= encuesta.getNomEncuesta() %></td>
                <td><button onclick="window.location.href = 'ServletEncuestaEditar?id=<%= encuesta.getIdEncuesta()%>';">Editar</button>
                <td><button onclick="window.location.href = 'ServletPreguntasInsertar?id=<%= encuesta.getIdEncuesta()%>';">Añadir Preguntas</button>   
                <td><button onclick="window.location.href = 'ServletEncuestaBorrar?id=<%= encuesta.getIdEncuesta()%>';">Borrar</button> 
                
            </tr>
                                                 
            
            <%
                }
            %>    
           
        </table>
    
        </fieldset>
        <button onclick="window.location.href = 'CrearEncuesta.jsp';">Crear nueva encuesta</button>
        <button onclick="window.location.href = 'Preguntas';">Listado de preguntas</button>
        <button onclick="window.location.href = 'Usuarios';">Usuarios</button>
        <button onclick="window.location.href = 'Registros';">Registros</button>
    </body>
</html>