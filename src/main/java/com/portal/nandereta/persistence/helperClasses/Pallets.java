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
public class Pallets {

    private Integer punta;
    private Integer lado;
    private Integer capacidadTotal;

    public Pallets() {
    }

    public Pallets(Integer punta, Integer lado, Integer capacidadTotal) {
        this.punta = punta;
        this.lado = lado;
        this.capacidadTotal = capacidadTotal;
    }

    public Integer getPunta() {
        return punta;
    }

    public void setPunta(Integer punta) {
        this.punta = punta;
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }

    public Integer getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(Integer capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

}
