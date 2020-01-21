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
public class RespuestaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idRespuesta;
    private String respuesta;

    public RespuestaDto() {
    }

    public RespuestaDto(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public RespuestaDto(Long idRespuesta, String respuesta) {
        this.idRespuesta = idRespuesta;
        this.respuesta = respuesta;
    }

    public Long getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuesta != null ? idRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestaDto)) {
            return false;
        }
        RespuestaDto other = (RespuestaDto) object;
        if ((this.idRespuesta == null && other.idRespuesta != null) || (this.idRespuesta != null && !this.idRespuesta.equals(other.idRespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Respuesta[ idRespuesta=" + idRespuesta + " ]";
    }
    
    
}
