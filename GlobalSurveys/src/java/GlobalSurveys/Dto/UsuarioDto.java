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

public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUsuario;

    private String nomUsuario;

    private String passwd;

    private boolean admin;

    //private List<SesionDto> sesionList;

    public UsuarioDto() {
    }

    public UsuarioDto(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioDto(Long idUsuario, String nomUsuario, String passwd, boolean admin) {
        this.idUsuario = idUsuario;
        this.nomUsuario = nomUsuario;
        this.passwd = passwd;
        this.admin = admin;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /*public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @XmlTransient
    public List<SesionDto> getSesionList() {
        return sesionList;
    }

    public void setSesionList(List<SesionDto> sesionList) {
        this.sesionList = sesionList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDto)) {
            return false;
        }
        UsuarioDto other = (UsuarioDto) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
