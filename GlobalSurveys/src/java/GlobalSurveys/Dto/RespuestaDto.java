/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author acarr
 */
@Entity
@Table(name = "RESPUESTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuesta.findAll", query = "SELECT r FROM Respuesta r")
    , @NamedQuery(name = "Respuesta.findByIdRespuesta", query = "SELECT r FROM Respuesta r WHERE r.idRespuesta = :idRespuesta")
    , @NamedQuery(name = "Respuesta.findByRespuesta", query = "SELECT r FROM Respuesta r WHERE r.respuesta = :respuesta")})

public class RespuestaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_RESPUESTA")
    private Long idRespuesta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "RESPUESTA")
    private String respuesta;
    @OneToMany(mappedBy = "idRespuesta")
    private List<SesionPreguntasDto> sesionPreguntasList;
    @JoinColumn(name = "ID_PREGUNTA", referencedColumnName = "ID_PREGUNTA")
    @ManyToOne(optional = false)
    private PreguntaDto idPregunta;

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

    @XmlTransient
    public List<SesionPreguntasDto> getSesionPreguntasList() {
        return sesionPreguntasList;
    }

    public void setSesionPreguntasList(List<SesionPreguntasDto> sesionPreguntasList) {
        this.sesionPreguntasList = sesionPreguntasList;
    }

    public PreguntaDto getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(PreguntaDto idPregunta) {
        this.idPregunta = idPregunta;
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
