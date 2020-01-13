<%-- 
    Document   : admin.jsp
    Created on : 08-ene-2020, 19:18:01
    Author     : Articuno
--%>

<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preguntas</title>
    <%
        List<Pregunta> lista = (List)request.getAttribute("listado");
    %>
    </head>
    <body>
        <h1>Listado de preguntas</h1>
        
        <table>
            <%
                for (Pregunta cliente: lista) {
            %>
            <tr>
                <td><%= cliente.getPregunta() %></td>
                <td><button onclick="window.location.href = 'ServletRespuestasCrear?id=<%= cliente.getIdPregunta()%>';">Definir respuestas</button>
                <td><button onclick="window.location.href = 'ServletPreguntasEditar?id=<%= cliente.getIdPregunta()%>';">Editar</button>                               
                <td><button onclick="window.location.href = 'ServletPreguntasBorrar?id=<%= cliente.getIdPregunta()%>';">Borrar</button>                                    
            </tr>
            <%
                }
            %>    
        </table>
        <button onclick="window.location.href = 'CrearPregunta.jsp';">Añadir pregunta</button>
        <button onclick="window.location.href = 'PanelAdmin.jsp';">Volver</button>
    </body>
</html>

