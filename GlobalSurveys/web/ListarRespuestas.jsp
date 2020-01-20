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
        String error = (String)request.getAttribute("error");
        if (error == null) error = ""; 
        List<Respuesta> lista = (List) request.getAttribute("listado");
    %>
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">LISTADO DE RESPUESTAS</h1></span>
        <fieldset>
            <p style="color: red"><%=error%></p>
        <table>
            <% 
                for (Respuesta cliente : lista) {
            %>
            <tr>
                <td>·<%= cliente.getRespuesta() %></td>
                <td><button onclick="window.location.href = 'ServletRespuestasEditar?id=<%=cliente.getIdRespuesta()%>';">Editar</button>                               
                <td><button onclick="window.location.href = 'ServletRespuestasBorrar?id=<%= cliente.getIdRespuesta()%>';">Borrar</button>                                    
            </tr>
            <%     
                }
            %>    
        </table>
        </fieldset>
        <button class="boton" onclick="window.location.href = 'CrearRespuesta.jsp?id=<%= request.getParameter("id")%>';">Añadir respuesta</button>
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </div>
    </body>
</html>

