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
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <%
        Encuesta enc = (Encuesta)request.getAttribute("encuesta");
        List<Pregunta> lista = (List)request.getAttribute("listado");
        
        %>
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">INSERTAR PREGUNTAS</h1></span>
        <form action="ServletPreguntasInsertarGuardar">
        <input type="hidden" name="encuesta" value="<%= request.getParameter("id") %>">
        <fieldset>
        <legend><%= enc.getNomEncuesta() %></legend>
        <table>

            <%
                for (Pregunta preg: lista) {
                    String checked = "";
                    if (enc.getPreguntaList().contains(preg)) {
                        checked = "checked";
                    }
            %>
            <tr>
           
                
                <td><input type="checkbox" <%= checked %> name="idpreguntas" value="<%= preg.getIdPregunta() %>"><%= preg.getPregunta() %></td>
            </tr>
            <%
                }
            %>    
        </table>
        </fieldset>
        <input type="submit" value="Enviar" />
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>
