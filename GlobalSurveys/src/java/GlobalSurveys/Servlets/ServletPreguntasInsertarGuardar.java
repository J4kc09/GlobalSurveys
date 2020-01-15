/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Servlets;

import GlobalSurveys.Ejb.EncuestaFacade;
import GlobalSurveys.Ejb.PreguntaFacade;
import GlobalSurveys.Ejb.UsuarioFacade;
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

@WebServlet(name = "ServletPreguntasInsertarGuardar", urlPatterns = {"/ServletPreguntasInsertarGuardar"})
public class ServletPreguntasInsertarGuardar extends HttpServlet {

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
        
        response.setContentType("text/html;charset=UTF-8");
 
        String[] str1 = request.getParameterValues("id");
        
        String str = request.getParameter("encuesta");
        /*for (int i = 0; i < str.length; i++) {
            Pregunta cliente.setPregunta(str[i]);
        }*/
        
        /*Pregunta cliente = this.preguntaFacade.find(new Long(str));*/
        
        /*str = request.getParameter("nombre");
        cliente.setPregunta(str);*/
         
         /*String value = request.getParameter("admin");
         if (value.equals("Si")) {
            boolean equals = value.equals("true");
        }
         else {
             boolean equals = value.equals("false");
         }
         boolean valueAdmin = Boolean.parseBoolean(value);
         cliente.setAdmin(valueAdmin);*/
        
        /*this.preguntaFacade.edit(cliente);*/
        
        RequestDispatcher rd = request.getRequestDispatcher("ServletPreguntasInsertar");
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
