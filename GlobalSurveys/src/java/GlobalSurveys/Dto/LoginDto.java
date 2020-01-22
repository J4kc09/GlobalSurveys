/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author sergio13v
 */
public class LoginDto implements Serializable {

    private Boolean correcto;
    private List<EncuestaDto> listaEncuesta;

    public Boolean getCorrecto() {
        return correcto;
    }

    public void setCorrecto(Boolean correcto) {
        this.correcto = correcto;
    }

    public List<EncuestaDto> getListaEncuesta() {
        return listaEncuesta;
    }

    public void setListaEncuesta(List<EncuestaDto> listaEncuesta) {
        this.listaEncuesta = listaEncuesta;
    }

    public LoginDto() {
    }
    
}
