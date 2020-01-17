<%-- 
    Document   : EditarUsuario
    Created on : Jan 13, 2020, 4:20:38 PM
    Author     : sergio13v
--%>

<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editor de usuarios</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    </head>
    <%
        Usuario cliente = (Usuario)request.getAttribute("cliente");
        List<Usuario> listaUsuarios = (List) request.getAttribute("usuario");
    %>    
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">EDITOR DE USUARIOS</h1></span>
        <form action="ServletUsuariosGuardar">
            <fieldset>
            <legend>ID Cliente: <%= cliente.getIdUsuario()%></legend>
            <input type="hidden" name="id" value="<%= cliente.getIdUsuario()%>" />
            Usuario <input class="input1" type="text" name="nombre" value="<%= cliente.getNomUsuario() %>" /> <br/>
            Contraseña <input class="input1" type="text" name="password" value="<%= cliente.getPasswd() %>" /> <br/> 

            
            Admin <select name="admin">
                <%
                        String strSi = "";
                        String strNo = "";                        
                        if (cliente.getAdmin()) {
                            strSi = "selected";
                        } else {
                            strNo = "selected";                            
                        }
                %>
                <option value="true" <%=strSi %> >Si</option>                 
                <option value="false" <%=strNo %> >No</option>                
                
            </select>
            
            
            </fieldset>
            <input type="submit" value="Enviar" />
            <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </form>
        </div>
    </body>
</html>
