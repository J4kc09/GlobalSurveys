<%@page import="GlobalSurveys.Entity.Respuesta"%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editor de respuestas</title>
    </head>
    <%
        Respuesta cliente = (Respuesta)request.getAttribute("cliente");
        List<Respuesta> listaRespuestas = (List) request.getAttribute("respuesta");
    %>    
    <body>
        <div>
        <h1>Editor de preguntas:</h1>
        <form action="ServletRespuestasGuardar">
            <input type="hidden" name="id" value="<%= cliente.getIdRespuesta()%>" />
            <input type="text" name="nombre" value="<%= cliente.getRespuesta() %>" /> <br/>           
            <input type="submit" value="Enviar" />
            <button onclick="window.location.href = 'Preguntas';">Volver</button>
        </form>
        </div>
    </body>
</html>