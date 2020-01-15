<%-- 
    Document   : PanelUsuario
    Created on : 08-ene-2020, 20:22:09
    Author     : Articuno
--%>

<%@page import="GlobalSurveys.Entity.Encuesta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="ISO-8859-1">
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Panel Usuario</title>
    </head>
    <body class="bg-info">
        <div class="container">
            <div class="row justify-content-md-center">
                <div class="col-4 display-1 mx-auto">
                    <h1>Panel Usuario</h1>
                </div>
                     
            </div>
        
        <br/>
        <br/>
            <div class="row">
                <div class="col align-self-center">
        <button onclick="window.location.href = 'ServletEncuestaListar';">Ver encuestas disponibles</button>
                 </div>
            </div>     
       </div>    
        
</html>