/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.helperClasses;

import javax.persistence.Embeddable;

/**
 *
 * @author juan.corvalan
 */
@Embeddable
public class Medidas {

    private Double anchoInterior;
    private Double altoInterior;
    private Double largoInterior;
    private Double anchoExterior;
    private Double altoExterior;
    private Double largoExterior;

    public Medidas() {
    }

    public Medidas(Double anchoInterior, Double altoInterior, Double largoInterior, Double anchoExterior, Double altoExterior, Double largoExterior) {
        this.anchoInterior = anchoInterior;
        this.altoInterior = altoInterior;
        this.largoInterior = largoInterior;
        this.anchoExterior = anchoExterior;
        this.altoExterior = altoExterior;
        this.largoExterior = largoExterior;
    }

    public Double getAnchoInterior() {
        return anchoInterior;
    }

    public void setAnchoInterior(Double anchoInterior) {
        this.anchoInterior = anchoInterior;
    }

    public Double getAltoInterior() {
        return altoInterior;
    }

    public void setAltoInterior(Double altoInterior) {
        this.altoInterior = altoInterior;
    }

    public Double getLargoInterior() {
        return largoInterior;
    }

    public void setLargoInterior(Double largoInterior) {
        this.largoInterior = largoInterior;
    }

    public Double getAnchoExterior() {
        return anchoExterior;
    }

    public void setAnchoExterior(Double anchoExterior) {
        this.anchoExterior = anchoExterior;
    }

    public Double getAltoExterior() {
        return altoExterior;
    }

    public void setAltoExterior(Double altoExterior) {
        this.altoExterior = altoExterior;
    }

    public Double getLargoExterior() {
        return largoExterior;
    }

    public void setLargoExterior(Double largoExterior) {
        this.largoExterior = largoExterior;
    }

}
