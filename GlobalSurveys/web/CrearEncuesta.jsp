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
    </head>
    <body>
         <form action="ServletEncuestaCrear">
             
             <input type="hidden" name="id" value="0" />
            CREADOR DE ENCUESTAS <br/> 
            Titulo:<input type="text" name="encuesta" value="" /> <br/>
            Descripción:<input type="text" name="descripcion" value=""/> <br/>
             <input type="submit" value="Crear" />
        </form>
        <button onclick="history.back()">Volver</button>
        
        
    </body>
</html>