/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author acarr
 */
@Embeddable
public class SesionPreguntasPKDto implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SESION")
    private long idSesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PREGUNTA")
    private long idPregunta;

    public SesionPreguntasPKDto() {
    }

    public SesionPreguntasPKDto(long idSesion, long idPregunta) {
        this.idSesion = idSesion;
        this.idPregunta = idPregunta;
    }

    public long getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(long idSesion) {
        this.idSesion = idSesion;
    }

    public long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(long idPregunta) {
        this.idPregunta = idPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idSesion;
        hash += (int) idPregunta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionPreguntasPKDto)) {
            return false;
        }
        SesionPreguntasPKDto other = (SesionPreguntasPKDto) object;
        if (this.idSesion != other.idSesion) {
            return false;
        }
        if (this.idPregunta != other.idPregunta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SesionPreguntasPK[ idSesion=" + idSesion + ", idPregunta=" + idPregunta + " ]";
    }
    
}
