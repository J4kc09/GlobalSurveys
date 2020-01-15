/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Servlets;

import GlobalSurveys.Ejb.EncuestaFacade;
import GlobalSurveys.Ejb.PreguntaFacade;
import GlobalSurveys.Entity.Encuesta;
import GlobalSurveys.Entity.Pregunta;
import GlobalSurveys.Entity.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @author sergio13v
 */

@WebServlet(name = "ServletPreguntasInsertar", urlPatterns = {"/ServletPreguntasInsertar"})
public class ServletPreguntasInsertar extends HttpServlet {

    @EJB
    private EncuestaFacade encuestaFacade;
    
    @EJB
    private PreguntaFacade preguntaFacade;

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

        String str = request.getParameter("id");
        
        Encuesta cliente = this.encuestaFacade.find(new Long (str));
        request.setAttribute("cliente", cliente);
        
        List<Pregunta> lista = this.preguntaFacade.findAll();
        request.setAttribute("listado", lista);
        
        /*String str = request.getParameter("id");
        
        Pregunta cliente = this.preguntaFacade.find(new Long (str));
        request.setAttribute("cliente", cliente);
        
        List<Pregunta> lista = this.preguntaFacade.findAll();
        request.setAttribute("listado", lista);*/
        
        RequestDispatcher rd = request.getRequestDispatcher("InsertarPregunta.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
