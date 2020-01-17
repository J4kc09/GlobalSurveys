<%-- 
    Document   : CrearPregunta
    Created on : 08-ene-2020, 20:23:23
    Author     : Articuno
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creador de preguntas</title>
    </head>
    <body>
        <form action="ServletPreguntasCrear">
             <input type="hidden" name="id" value="0" />
            CREADOR DE PREGUNTAS <br/> 
            Enunciado de la pregunta:<input type="text" name="pregunta" value="" /> <br/>
           <input type="submit" value="Crear" />
        </form>
        <button onclick="history.back()">Volver</button>
    </body>
</html>