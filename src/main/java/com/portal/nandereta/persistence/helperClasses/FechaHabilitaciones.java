/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.helperClasses;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author juan.corvalan
 */
@Embeddable
public class FechaHabilitaciones {

    @Column(name = "senasa")
    private LocalDate senasa;
    
    @Column(name = "bromatologia_muni")
    private LocalDate bromatologiaMuni;
    
    @Column(name = "bromatologia_caba")
    private LocalDate bromatologiaCABA;

    public FechaHabilitaciones() {
    }

    public FechaHabilitaciones(LocalDate senasa, LocalDate bromatologiaMuni, LocalDate bromatologiaCABA) {
        this.senasa = senasa;
        this.bromatologiaMuni = bromatologiaMuni;
        this.bromatologiaCABA = bromatologiaCABA;
    }

    public LocalDate getSenasa() {
        return senasa;
    }

    public void setSenasa(LocalDate senasa) {
        this.senasa = senasa;
    }

    public LocalDate getBromatologiaMuni() {
        return bromatologiaMuni;
    }

    public void setBromatologiaMuni(LocalDate bromatologiaMuni) {
        this.bromatologiaMuni = bromatologiaMuni;
    }

    public LocalDate getBromatologiaCABA() {
        return bromatologiaCABA;
    }

    public void setBromatologiaCABA(LocalDate bromatologiaCABA) {
        this.bromatologiaCABA = bromatologiaCABA;
    }

}
