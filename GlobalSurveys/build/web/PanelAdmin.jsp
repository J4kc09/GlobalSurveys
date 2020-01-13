<%-- 
    Document   : admin.jsp
    Created on : 08-ene-2020, 19:18:01
    Author     : Articuno
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel Admin</title>
    </head>
    <body>
        <h1>Panel Admin</h1>
        <button onclick="window.location.href = 'CrearEncuesta.jsp';">Crear nueva encuesta</button>
        <button onclick="window.location.href = 'Preguntas';">Listado de preguntas</button>
        <button onclick="window.location.href = 'Usuarios';">Usuarios</button>
        <button onclick="window.location.href = 'Registros';">Registros</button>
    </body>
</html>