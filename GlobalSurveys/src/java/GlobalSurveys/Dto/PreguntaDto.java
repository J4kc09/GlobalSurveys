/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author acarr
 */
public class PreguntaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idPregunta;
    private String pregunta;
    private List<RespuestaDto> respuestaList;

    public PreguntaDto() {
    }

    public PreguntaDto(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public PreguntaDto(Long idPregunta, String pregunta) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
    }

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @XmlTransient
    public List<RespuestaDto> getRespuestaList() {
        return respuestaList;
    }

    public void setRespuestaList(List<RespuestaDto> respuestaList) {
        this.respuestaList = respuestaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPregunta != null ? idPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreguntaDto)) {
            return false;
        }
        PreguntaDto other = (PreguntaDto) object;
        if ((this.idPregunta == null && other.idPregunta != null) || (this.idPregunta != null && !this.idPregunta.equals(other.idPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Pregunta[ idPregunta=" + idPregunta + " ]";
    }
    
}
