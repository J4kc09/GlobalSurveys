/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Ejb;

import GlobalSurveys.Entity.Respuesta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author acarr
 */
@Stateless
public class RespuestaFacade extends AbstractFacade<Respuesta> {

    @PersistenceContext(unitName = "GlobalSurveysPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespuestaFacade() {
        super(Respuesta.class);
    }
    
    @Override
    public void create(Respuesta entity) {
           super.create(entity);
           this.getEntityManager().flush();
    } 
   

}
