package GlobalSurveys.Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import GlobalSurveys.Ejb.PreguntaFacade;
import GlobalSurveys.Ejb.RespuestaFacade;
import GlobalSurveys.Entity.Pregunta;
import GlobalSurveys.Entity.Respuesta;
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

/**
 *
 * @author acarr
 */
@WebServlet(urlPatterns = {"/Respuestas"})
public class ServletRespuestasListar extends HttpServlet {

    @EJB
    private PreguntaFacade preguntaFacade;

    @EJB
    private RespuestaFacade respuestaFacade;

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
        Pregunta preg = this.preguntaFacade.find(new Long(str));
        List respuesta = preg.getRespuestaList();
        request.setAttribute("listado", respuesta);
        
        if (respuesta.isEmpty()) {
            request.setAttribute("error", "No hay respuestas asociadas a la pregunta seleccionada.");
            RequestDispatcher rd2 = request.getRequestDispatcher("ListarRespuestas.jsp");
            rd2.forward(request, response);
        }else{

            RequestDispatcher rd2 = request.getRequestDispatcher("ListarRespuestas.jsp");
            rd2.forward(request, response);
        }
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
