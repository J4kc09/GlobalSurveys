/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Servlets;

import GlobalSurveys.Ejb.EncuestaFacade;
import GlobalSurveys.Ejb.PreguntaFacade;
import GlobalSurveys.Ejb.RespuestaFacade;
import GlobalSurveys.Ejb.SesionFacade;
import GlobalSurveys.Ejb.SesionPreguntasFacade;
import GlobalSurveys.Entity.Encuesta;
import GlobalSurveys.Entity.Pregunta;
import GlobalSurveys.Entity.Respuesta;
import GlobalSurveys.Entity.Sesion;
import GlobalSurveys.Entity.SesionPreguntas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Articuno
 */
@WebServlet(name = "ServletEncuestaEnviar", urlPatterns = {"/ServletEncuestaEnviar"})
public class ServletEncuestaEnviar extends HttpServlet {

    @EJB
    private SesionPreguntasFacade sesionPreguntasFacade;

    @EJB
    private SesionFacade sesionFacade;

    @EJB
    private RespuestaFacade respuestaFacade;

    @EJB
    private EncuestaFacade encuestaFacade;


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

        HttpSession sesion = request.getSession();
        Sesion sesionuser = (Sesion) sesion.getAttribute("sesion");
        
          String str = request.getParameter("idencuesta");
         
          Encuesta encuesta = this.encuestaFacade.find(new Long(str));
         
            for (Pregunta preg: encuesta.getPreguntaList()) {                
                str = request.getParameter(preg.getIdPregunta()+"");
                if (str == null) continue;
                Respuesta resp = this.respuestaFacade.find(new Long(str));
                
                
                SesionPreguntas sespreg = new SesionPreguntas(sesionuser.getIdSesion(), preg.getIdPregunta());
                sespreg.setSesion(sesionuser);
                sespreg.setPregunta(preg);
                sespreg.setIdRespuesta(resp);
                
                sesionuser.getSesionPreguntasList().add(sespreg);
                this.sesionPreguntasFacade.create(sespreg);
                this.sesionFacade.edit(sesionuser);               
            }

          sesion.setAttribute("idencuesta", encuesta.getIdEncuesta());
                    
                    
         RequestDispatcher rd = request.getRequestDispatcher("EncuestasUsuario");
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