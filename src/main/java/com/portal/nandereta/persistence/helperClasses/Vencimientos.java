/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.helperClasses;

import java.time.LocalDate;
import javax.persistence.Embeddable;

/**
 *
 * @author juan.corvalan
 */
@Embeddable
public class Vencimientos {
    private LocalDate cedulaVerde;
    private LocalDate ruta;
    private LocalDate vtv;          // verificación técnica vehícular
    private LocalDate seguroObligatorio;

    public Vencimientos() {
    }

    public Vencimientos(LocalDate cedulaVerde, LocalDate ruta, LocalDate vtv, LocalDate seguroObligatorio) {
        this.cedulaVerde = cedulaVerde;
        this.ruta = ruta;
        this.vtv = vtv;
        this.seguroObligatorio = seguroObligatorio;
    }

    public LocalDate getCedulaVerde() {
        return cedulaVerde;
    }

    public void setCedulaVerde(LocalDate cedulaVerde) {
        this.cedulaVerde = cedulaVerde;
    }

    public LocalDate getRuta() {
        return ruta;
    }

    public void setRuta(LocalDate ruta) {
        this.ruta = ruta;
    }

    public LocalDate getVtv() {
        return vtv;
    }

    public void setVtv(LocalDate vtv) {
        this.vtv = vtv;
    }

    public LocalDate getSeguroObligatorio() {
        return seguroObligatorio;
    }

    public void setSeguroObligatorio(LocalDate seguroObligatorio) {
        this.seguroObligatorio = seguroObligatorio;
    }
    
    
}
