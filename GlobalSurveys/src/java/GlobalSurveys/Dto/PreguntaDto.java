/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "PREGUNTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findByIdPregunta", query = "SELECT p FROM Pregunta p WHERE p.idPregunta = :idPregunta")
    , @NamedQuery(name = "Pregunta.findByPregunta", query = "SELECT p FROM Pregunta p WHERE p.pregunta = :pregunta")})
public class PreguntaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PREGUNTA")
    private Long idPregunta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PREGUNTA")
    private String pregunta;
    @ManyToMany(mappedBy = "preguntaList")
    private List<EncuestaDto> encuestaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pregunta")
    private List<SesionPreguntasDto> sesionPreguntasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPregunta")
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
    public List<EncuestaDto> getEncuestaList() {
        return encuestaList;
    }

    public void setEncuestaList(List<EncuestaDto> encuestaList) {
        this.encuestaList = encuestaList;
    }

    @XmlTransient
    public List<SesionPreguntasDto> getSesionPreguntasList() {
        return sesionPreguntasList;
    }

    public void setSesionPreguntasList(List<SesionPreguntasDto> sesionPreguntasList) {
        this.sesionPreguntasList = sesionPreguntasList;
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
