<%-- 
    Document   : CrearEncuesta
    Created on : 08-ene-2020, 20:23:11
    Author     : Articuno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear encuesta</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">CREADOR DE ENCUESTAS</h1></span>
        <form action="ServletEncuestaCrear">
             <fieldset>
             <input type="hidden" name="id" value="0" />
             Titulo:<input class="input1" type="text" name="encuesta" value="" /> <br/>
             Descripción:<input class="input1" type="text" name="descripcion" value=""/> <br/>
             </fieldset>
             <input type="submit" value="Crear" />
             <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>  
    </body>
</html>