
package com.portfolio.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Facu
 */
public class dtoEducacion {
    
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String nivelEd;
    @NotBlank
    private String periodoEd;
    @NotBlank
    private String ubicacionEd;
    @NotBlank
    private String tituloEd;

    //CONSTRUCTOR

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEd, String nivelEd, String periodoEd, String ubicacionEd, String tituloEd) {
        this.nombreEd = nombreEd;
        this.nivelEd = nivelEd;
        this.periodoEd = periodoEd;
        this.ubicacionEd = ubicacionEd;
        this.tituloEd = tituloEd;
    }

    
    
    // g and s

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getNivelEd() {
        return nivelEd;
    }

    public void setNivelEd(String nivelEd) {
        this.nivelEd = nivelEd;
    }

    public String getPeriodoEd() {
        return periodoEd;
    }

    public void setPeriodoEd(String periodoEd) {
        this.periodoEd = periodoEd;
    }

    public String getUbicacionEd() {
        return ubicacionEd;
    }

    public void setUbicacionEd(String ubicacionEd) {
        this.ubicacionEd = ubicacionEd;
    }

    public String getTituloEd() {
        return tituloEd;
    }

    public void setTituloEd(String tituloEd) {
        this.tituloEd = tituloEd;
    }

   

    

   
    
}
