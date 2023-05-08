/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreE;
    private String empresaE;
    private String periodoE;
    private String ubicacionE;
    private String descripcionE;
    
    
    //constructor

    public Experiencia() {
    }

    public Experiencia(String nombreE, String empresaE, String periodoE, String ubicacionE, String descripcionE) {
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.periodoE = periodoE;
        this.ubicacionE = ubicacionE;
        this.descripcionE = descripcionE;
    }
    
    
    
    
    //g and s

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
