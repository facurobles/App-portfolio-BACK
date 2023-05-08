
package com.portfolio.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Facu
 */
public class dtoExperiencia {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String empresaE;
    @NotBlank
    private String periodoE;
    @NotBlank
    private String ubicacionE;
    @NotBlank
    private String descripcionE;

    //CONSTR

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String empresaE, String periodoE, String ubicacionE, String descripcionE) {
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.periodoE = periodoE;
        this.ubicacionE = ubicacionE;
        this.descripcionE = descripcionE;
    }
    
    // g and s

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }

    public String getUbicacionE() {
        return ubicacionE;
    }

    public void setUbicacionE(String ubicacionE) {
        this.ubicacionE = ubicacionE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

   
    
}
