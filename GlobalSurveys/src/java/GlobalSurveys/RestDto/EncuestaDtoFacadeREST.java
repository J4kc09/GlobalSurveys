/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.RestDto;

import GlobalSurveys.Dto.EncuestaDto;
import GlobalSurveys.Dto.LoginDto;
import GlobalSurveys.Dto.RespuestaDto;
import GlobalSurveys.Dto.UsuarioDto;
import GlobalSurveys.Ejb.EncuestaFacade;
import GlobalSurveys.Ejb.UsuarioFacade;
import GlobalSurveys.Entity.Encuesta;
import GlobalSurveys.Entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.RequestDispatcher;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sergio13v
 */
@Stateless
@Path("rest")
public class EncuestaDtoFacadeREST {

    @EJB
    private UsuarioFacade usuarioFacade;

    @EJB
    private EncuestaFacade encuestaFacade;
    


    public EncuestaDtoFacadeREST() {
        
    }
    
    @GET
    @Path("login/{usuario}/{clave}")
    @Produces({MediaType.APPLICATION_JSON})
    public LoginDto findUsuario(@PathParam("usuario") String usuario, @PathParam("clave") String clave) {
        LoginDto login = new LoginDto();
        Usuario user = this.usuarioFacade.buscarPorNombre(usuario);
        if (user != null && user.getNomUsuario().equals(usuario) && user.getPasswd().equals(clave)) {
            login.setCorrecto(Boolean.TRUE);
            login.setListaEncuesta(findAllEncuestas()); 
        }
        else {
            login.setCorrecto(Boolean.FALSE);
        }
        return login;                
    }
    
    @GET
    @Path("encuestas")
    @Produces({MediaType.APPLICATION_JSON})
    public List<EncuestaDto> findAllEncuestas() {
        List<Encuesta> lista = encuestaFacade.findAll();
        List<EncuestaDto> listaDto = new ArrayList();
        if (lista != null && !lista.isEmpty()) {
            for (Encuesta encuesta:lista) {
                listaDto.add(encuesta.crearDTO());
            }
        }
        return listaDto;
    }    

    /*
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(EncuestaDto entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, EncuestaDto entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public EncuestaDto find(@PathParam("id") Long id) {
        return super.find(id);
    }


    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<EncuestaDto> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
*/
    
}
