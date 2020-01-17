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
    </head>
    <%
        Usuario cliente = (Usuario)request.getAttribute("cliente");
        List<Usuario> listaUsuarios = (List) request.getAttribute("usuario");
    %>    
    <body>
        <h1>Editor de usuarios:</h1>
        <form action="ServletUsuariosGuardar">
            ID Cliente: <%= cliente.getIdUsuario()%> <br>
            <input type="hidden" name="id" value="<%= cliente.getIdUsuario()%>" />
            Usuario <input type="text" name="nombre" value="<%= cliente.getNomUsuario() %>" /> <br/>
            Contraseña <input type="text" name="password" value="<%= cliente.getPasswd() %>" /> <br/> 

            
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
            
            
            
            <input type="submit" value="Enviar" />
            <input type="button" onclick="history.back()" name="volver" value="Volver">
        </form>
    </body>
</html>
