<%@page import="GlobalSurveys.Entity.Pregunta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editor de preguntas</title>
    </head>
    <%
        Pregunta cliente = (Pregunta)request.getAttribute("cliente");
        List<Pregunta> listaPreguntas = (List) request.getAttribute("pregunta");
    %>    
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">EDITOR DE PREGUNTAS</h1></span>
        <form action="ServletPreguntasGuardar">
            <fieldset>
            <input type="hidden" name="id" value="<%= cliente.getIdPregunta()%>" />
            <input class="input1" type="text" name="nombre" value="<%= cliente.getPregunta() %>" /> <br/>           
            </fieldset>
            <input type="submit" value="Enviar" />
            <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>
