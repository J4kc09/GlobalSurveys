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
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preguntas</title>
    <%
        List<Pregunta> lista = (List)request.getAttribute("listado");
    %>
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">LISTADO DE PREGUNTAS</h1></span>
        <fieldset>
        <table>
            <%
                for (Pregunta cliente: lista) {
            %>
            <tr>
                <td><%= cliente.getPregunta() %></td>
                <td><button onclick="window.location.href = 'Respuestas?id=<%=cliente.getIdPregunta()%>';">Definir respuestas</button>
                <td><button onclick="window.location.href = 'ServletPreguntasEditar?id=<%= cliente.getIdPregunta()%>';">Editar</button>                               
                <td><button onclick="window.location.href = 'ServletPreguntasBorrar?id=<%= cliente.getIdPregunta()%>';">Borrar</button>                                    
            </tr>
            <%
                }
            %>    
        </table>
        </fieldset>
        <button class="boton" onclick="window.location.href = 'CrearPregunta.jsp';">Añadir pregunta</button>
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </div>
    </body>
</html>

