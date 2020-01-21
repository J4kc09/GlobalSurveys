/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acarr
 */

public class SesionPreguntasDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected SesionPreguntasPKDto sesionPreguntasPK;
    
    private SesionDto sesion;
    
    private PreguntaDto pregunta;
    
    private RespuestaDto idRespuesta;

    public SesionPreguntasDto() {
    }

    public SesionPreguntasDto(SesionPreguntasPKDto sesionPreguntasPK) {
        this.sesionPreguntasPK = sesionPreguntasPK;
    }

    public SesionPreguntasDto(long idSesion, long idPregunta) {
        this.sesionPreguntasPK = new SesionPreguntasPKDto(idSesion, idPregunta);
    }

    public SesionPreguntasPKDto getSesionPreguntasPK() {
        return sesionPreguntasPK;
    }

    public void setSesionPreguntasPK(SesionPreguntasPKDto sesionPreguntasPK) {
        this.sesionPreguntasPK = sesionPreguntasPK;
    }

    public SesionDto getSesion() {
        return sesion;
    }

    public void setSesion(SesionDto sesion) {
        this.sesion = sesion;
    }

    public PreguntaDto getPregunta() {
        return pregunta;
    }

    public void setPregunta(PreguntaDto pregunta) {
        this.pregunta = pregunta;
    }

    public RespuestaDto getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(RespuestaDto idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sesionPreguntasPK != null ? sesionPreguntasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionPreguntasDto)) {
            return false;
        }
        SesionPreguntasDto other = (SesionPreguntasDto) object;
        if ((this.sesionPreguntasPK == null && other.sesionPreguntasPK != null) || (this.sesionPreguntasPK != null && !this.sesionPreguntasPK.equals(other.sesionPreguntasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SesionPreguntas[ sesionPreguntasPK=" + sesionPreguntasPK + " ]";
    }
    
}
