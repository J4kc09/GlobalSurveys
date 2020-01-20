/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import GlobalSurveys.Entity.SesionPreguntas;
import GlobalSurveys.Entity.SesionPreguntasPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author sergio13v
 */
@Stateless
@Path("globalsurveys.entity.sesionpreguntas")
public class SesionPreguntasFacadeREST extends AbstractFacade<SesionPreguntas> {

    @PersistenceContext(unitName = "GlobalSurveysPU")
    private EntityManager em;

    private SesionPreguntasPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idSesion=idSesionValue;idPregunta=idPreguntaValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        GlobalSurveys.Entity.SesionPreguntasPK key = new GlobalSurveys.Entity.SesionPreguntasPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idSesion = map.get("idSesion");
        if (idSesion != null && !idSesion.isEmpty()) {
            key.setIdSesion(new java.lang.Long(idSesion.get(0)));
        }
        java.util.List<String> idPregunta = map.get("idPregunta");
        if (idPregunta != null && !idPregunta.isEmpty()) {
            key.setIdPregunta(new java.lang.Long(idPregunta.get(0)));
        }
        return key;
    }

    public SesionPreguntasFacadeREST() {
        super(SesionPreguntas.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(SesionPreguntas entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, SesionPreguntas entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        GlobalSurveys.Entity.SesionPreguntasPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public SesionPreguntas find(@PathParam("id") PathSegment id) {
        GlobalSurveys.Entity.SesionPreguntasPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<SesionPreguntas> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<SesionPreguntas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
