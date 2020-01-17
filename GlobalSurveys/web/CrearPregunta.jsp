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
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">CREADOR DE PREGUNTAS</h1></span>
        <form action="ServletPreguntasCrear">
            <fieldset
             <input type="hidden" name="id" value="0" />
             Enunciado de la pregunta:<input class="input1" type="text" name="pregunta" value="" /> <br/>
            </fieldset>
           <input type="submit" value="Crear" />
           <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>