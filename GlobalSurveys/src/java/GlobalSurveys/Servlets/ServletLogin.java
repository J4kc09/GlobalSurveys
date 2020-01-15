/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Servlets;

import GlobalSurveys.Ejb.UsuarioFacade;
import GlobalSurveys.Entity.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Articuno
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/Login"})
public class ServletLogin extends HttpServlet {

    @EJB
    private UsuarioFacade usuarioFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("user");
        String pass = request.getParameter("pass");

        Usuario user = this.usuarioFacade.buscarPorNombre(nombre);

        if (nombre == null && pass == null) {
            RequestDispatcher rd2 = request.getRequestDispatcher("Login.jsp");
            rd2.forward(request, response);

        }
        if (user == null) {
            request.setAttribute("error", "Usuario o contraseña incorrecto. Inténtelo de nuevo.");
            RequestDispatcher rd2 = request.getRequestDispatcher("Login.jsp");
            rd2.forward(request, response);

        } else {

            if (user.getPasswd().equals(pass)) {

                if (true == user.getAdmin()) {

                    RequestDispatcher rd3 = request.getRequestDispatcher("ServletEncuestaListar");
                    rd3.forward(request, response);
                } else {

                    RequestDispatcher rd4 = request.getRequestDispatcher("PanelUsuario.jsp");
                    rd4.forward(request, response);

                }

            } else {

                request.setAttribute("error", "Usuario o contraseña incorrectos. Inténtelo de nuevo.");
                RequestDispatcher rd5 = request.getRequestDispatcher("Login.jsp");
                rd5.forward(request, response);

            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
