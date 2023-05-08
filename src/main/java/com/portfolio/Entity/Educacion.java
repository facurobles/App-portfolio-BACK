
package com.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreEd;
    private String nivelEd;
    private String periodoEd;
    private String ubicacionEd;
    private String tituloEd;
    
    
    //constructor

    public Educacion() {
    }

    public Educacion(String nombreEd, String nivelEd, String periodoEd, String ubicacionEd, String tituloEd) {
        this.nombreEd = nombreEd;
        this.nivelEd = nivelEd;
        this.periodoEd = periodoEd;
        this.ubicacionEd = ubicacionEd;
        this.tituloEd = tituloEd;
    }

   

       
        //g and s

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
