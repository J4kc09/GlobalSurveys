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
    <%
        List<Usuario> lista = (List)request.getAttribute("listado");
    %>
    </head>
    <body>
        <h1>Listado de usuarios</h1>
        
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
        <button onclick="window.location.href = 'CrearUsuario.jsp';">Añadir usuario</button>
        <button onclick="window.location.href = 'PanelAdmin.jsp';">Volver</button>
    </body>
</html>