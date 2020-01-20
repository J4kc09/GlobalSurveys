<%-- 
    Document   : VerRegistro
    Created on : Jan 20, 2020, 6:07:25 PM
    Author     : sergio13v
--%>

<%@page import="GlobalSurveys.Entity.SesionPreguntas"%>
<%@page import="GlobalSurveys.Entity.Respuesta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver registro</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    <%
        List<SesionPreguntas> lista = (List)request.getAttribute("sesion");
    %>
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">LISTADO DE USUARIOS</h1></span>
        <fieldset>
        <table>
            <tr>
                <th>Pregunta</th>
                <th>Respuesta</th>
            </tr>
            <%
                for (SesionPreguntas resp: lista) {
            %>
            <tr>
                <td><%= resp.getPregunta().getPregunta() %></td>
                <td><%= resp.getIdRespuesta().getRespuesta() %></td>                                  
            </tr>
            <%
                }
            %>    
        </table>
        </fieldset>
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </div>
    </body>
</html>