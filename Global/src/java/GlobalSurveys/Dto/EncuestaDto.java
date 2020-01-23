/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;

/**
 *
 * @author acarr
 */
public class EncuestaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idEncuesta;
    private String nomEncuesta;
    private String descripcionEncuesta;

    public EncuestaDto() {
    }

    public EncuestaDto(Long idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public EncuestaDto(Long idEncuesta, String nomEncuesta, String descripcionEncuesta) {
        this.idEncuesta = idEncuesta;
        this.nomEncuesta = nomEncuesta;
        this.descripcionEncuesta = descripcionEncuesta;
    }

    public Long getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Long idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getNomEncuesta() {
        return nomEncuesta;
    }

    public void setNomEncuesta(String nomEncuesta) {
        this.nomEncuesta = nomEncuesta;
    }

    public String getDescripcionEncuesta() {
        return descripcionEncuesta;
    }

    public void setDescripcionEncuesta(String descripcionEncuesta) {
        this.descripcionEncuesta = descripcionEncuesta;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEncuesta != null ? idEncuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncuestaDto)) {
            return false;
        }
        EncuestaDto other = (EncuestaDto) object;
        if ((this.idEncuesta == null && other.idEncuesta != null) || (this.idEncuesta != null && !this.idEncuesta.equals(other.idEncuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Encuesta[ idEncuesta=" + idEncuesta + " ]";
    }
    
}
