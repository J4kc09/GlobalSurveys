/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author acarr
 */
@Entity
@Table(name = "SESION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sesion.findAll", query = "SELECT s FROM Sesion s")
    , @NamedQuery(name = "Sesion.findByIdSesion", query = "SELECT s FROM Sesion s WHERE s.idSesion = :idSesion")
    , @NamedQuery(name = "Sesion.findByFecha", query = "SELECT s FROM Sesion s WHERE s.fecha = :fecha")})
public class SesionDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SESION")
    private Long idSesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sesion")
    private List<SesionPreguntasDto> sesionPreguntasList;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private UsuarioDto idUsuario;
    @JoinColumn(name = "ID_ENCUESTA", referencedColumnName = "ID_ENCUESTA")
    @ManyToOne(optional = false)
    private EncuestaDto idEncuesta;

    public SesionDto() {
    }

    public SesionDto(Long idSesion) {
        this.idSesion = idSesion;
    }

    public SesionDto(Long idSesion, Date fecha) {
        this.idSesion = idSesion;
        this.fecha = fecha;
    }

    public Long getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Long idSesion) {
        this.idSesion = idSesion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<SesionPreguntasDto> getSesionPreguntasList() {
        return sesionPreguntasList;
    }

    public void setSesionPreguntasList(List<SesionPreguntasDto> sesionPreguntasList) {
        this.sesionPreguntasList = sesionPreguntasList;
    }

    public UsuarioDto getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioDto idUsuario) {
        this.idUsuario = idUsuario;
    }

    public EncuestaDto getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(EncuestaDto idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionDto)) {
            return false;
        }
        SesionDto other = (SesionDto) object;
        if ((this.idSesion == null && other.idSesion != null) || (this.idSesion != null && !this.idSesion.equals(other.idSesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Sesion[ idSesion=" + idSesion + " ]";
    }
    
}
