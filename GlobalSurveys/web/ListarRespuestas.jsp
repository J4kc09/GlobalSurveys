<%-- 
    Document   : admin.jsp
    Created on : 08-ene-2020, 19:18:01
    Author     : Articuno
--%>

<%@page import="GlobalSurveys.Entity.Respuesta"%>
<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuestas</title>
    <%
        String id2 = request.getParameter("id");
        List<Respuesta> lista = (List)request.getAttribute("listado");
        String error = (String)request.getAttribute("error");
        if (error == null) error = "";
    %>
    </head>
    <body>
        <div>
        <h1>Listado de respuestas</h1>
        <fieldset>
        <table>
            <p style="color: red"><%=error%></p>
            <%
                for (Respuesta id:lista) {
            %>
            <tr>
                <td><%= id.getIdRespuesta()%></td>
                <td><%= id.getIdPregunta()%></td>
                <td><%= id.getRespuesta() %></td>
                <td><button onclick="window.location.href = 'ServletRespuestasEditar?id=<%=id.getIdRespuesta()%>';">Editar</button>                               
                <td><button onclick="window.location.href = 'ServletRespuestasBorrar?id=<%= id.getIdRespuesta()%>';">Borrar</button>                                    
            </tr>
            <%     
                }
            %>    
        </table>
        </fieldset>
        <button onclick="window.location.href = 'CrearRespuesta.jsp?id=<%= request.getParameter("id")%>';">Añadir respuesta</button>
        <button onclick="window.location.href = 'Preguntas';">Volver</button>
        </div>
    </body>
</html>

