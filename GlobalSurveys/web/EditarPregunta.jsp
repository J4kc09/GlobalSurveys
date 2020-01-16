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
        <h1>Editor de preguntas:</h1>
        <form action="ServletPreguntasGuardar">
            <input type="hidden" name="id" value="<%= cliente.getIdPregunta()%>" />
            <input type="text" name="nombre" value="<%= cliente.getPregunta() %>" /> <br/>           
            <input type="submit" value="Enviar" />
        </form>
        <button onclick="history.back()">Volver</button>
        </div>
    </body>
</html>
