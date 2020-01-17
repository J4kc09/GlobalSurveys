<%-- 
    Document   : ListarUsuarios
    Created on : Jan 13, 2020, 5:08:15 PM
    Author     : sergio13v
--%>

<%@page import="java.util.List"%>
<%@page import="GlobalSurveys.Entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
        <link rel="stylesheet" type="text/css" href="Styles.css">
    <%
        List<Usuario> lista = (List)request.getAttribute("listado");
    %>
    </head>
    <body>
        <div>
        <span><img class="logo" id="imagen" src="https://karrasko.ddns.net/assets/logo.png" alt="GlobalSurveys logo" height="70"><h1 id="texto">LISTADO DE USUARIOS</h1></span>
        <fieldset>
        <table>
            <tr>
                <th>Usuario</th>
                <th>Contraseña</th>
                <th>Admin</th>
            </tr>
            <%
                for (Usuario cliente: lista) {
            %>
            <tr>
                <td><%= cliente.getNomUsuario() %></td>
                <td><%= cliente.getPasswd() %></td>
                <td><%= cliente.getAdmin() %></td>
                <td><button onclick="window.location.href = 'ServletUsuariosEditar?id=<%= cliente.getIdUsuario()%>';">Editar</button>                               
                <td><button onclick="window.location.href = 'ServletUsuariosBorrar?id=<%= cliente.getIdUsuario()%>';">Borrar</button>                                    
            </tr>
            <%
                }
            %>    
        </table>
        </fieldset>
        <button class="boton" onclick="window.location.href = 'CrearUsuario.jsp';">Añadir usuario</button>
        <input type="button" class="boton" onclick="history.back()" name="volver" value="Volver">
        </div>
    </body>
</html>