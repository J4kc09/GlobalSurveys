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
        <title>JSP Page</title>
    </head>
    <body>
         <form action="ServletEncuestaCrear">
             
             <input type="hidden" name="id" value="0" />
            CREADOR DE ENCUESTAS <br/> Enunciado de encuesta:<input type="text" name="encuesta" value="" /> <br/>
                                       Descripcion:<input type="text" name="descripcion" value=""/> <br/>
             <input type="submit" value="Crear" />
        </form>
        
        
    </body>
</html>
