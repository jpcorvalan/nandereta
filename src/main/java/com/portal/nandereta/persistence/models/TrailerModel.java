/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.models;

import com.portal.nandereta.persistence.helperClasses.FechaHabilitaciones;
import com.portal.nandereta.persistence.helperClasses.Medidas;
import com.portal.nandereta.persistence.helperClasses.Pallets;
import com.portal.nandereta.persistence.helperClasses.Vencimientos;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author juan.corvalan
 */
@Entity
@Table(name = "trailer")
public class TrailerModel extends VehicleModel {

    private FechaHabilitaciones habilitaciones;
    private Integer capacidadCargaNeta;
    private Integer maxPesoSoportado;
    private Pallets pallets;
    private Integer ganchos;
    private Integer puertas;
    private String tipoPuerta;
    private Medidas medidas;
    private String palaHidraulica;
    private String equipoTermico;

    public TrailerModel() {
    }

    public TrailerModel(FechaHabilitaciones habilitaciones, Integer capacidadCargaNeta, Integer maxPesoSoportado, Pallets pallets, Integer ganchos, Integer puertas, String tipoPuerta, Medidas medidas, String palaHidraulica, String equipoTermico) {
        this.habilitaciones = habilitaciones;
        this.capacidadCargaNeta = capacidadCargaNeta;
        this.maxPesoSoportado = maxPesoSoportado;
        this.pallets = pallets;
        this.ganchos = ganchos;
        this.puertas = puertas;
        this.tipoPuerta = tipoPuerta;
        this.medidas = medidas;
        this.palaHidraulica = palaHidraulica;
        this.equipoTermico = equipoTermico;
    }

    public TrailerModel(FechaHabilitaciones habilitaciones, Integer capacidadCargaNeta, Integer maxPesoSoportado, Pallets pallets, Integer ganchos, Integer puertas, String tipoPuerta, Medidas medidas, String palaHidraulica, String equipoTermico, Long idVehicle, String nombreEntidadSolicitante, String tipoHabilitacion, String lugarDondeOpera, String motivoSolicitud, String tipoMovil, Vencimientos vencimientos, Long nroInternoMovil, String patente, String proveedor, String tipoCombustible, Integer ejes, String telefono, Boolean gps, String formato, Integer anio, String marca, String modelo, Double peso, String tipoAltura, Medidas exterior, Medidas interior, Double tempMinEnServicio) {
        super(idVehicle, nombreEntidadSolicitante, tipoHabilitacion, lugarDondeOpera, motivoSolicitud, tipoMovil, vencimientos, nroInternoMovil, patente, proveedor, tipoCombustible, ejes, telefono, gps, formato, anio, marca, modelo, peso, tipoAltura, medidas, tempMinEnServicio);
        this.habilitaciones = habilitaciones;
        this.capacidadCargaNeta = capacidadCargaNeta;
        this.maxPesoSoportado = maxPesoSoportado;
        this.pallets = pallets;
        this.ganchos = ganchos;
        this.puertas = puertas;
        this.tipoPuerta = tipoPuerta;
        this.medidas = medidas;
        this.palaHidraulica = palaHidraulica;
        this.equipoTermico = equipoTermico;
    }

    public FechaHabilitaciones getHabilitaciones() {
        return habilitaciones;
    }

    public void setHabilitaciones(FechaHabilitaciones habilitaciones) {
        this.habilitaciones = habilitaciones;
    }

    public Integer getCapacidadCargaNeta() {
        return capacidadCargaNeta;
    }

    public void setCapacidadCargaNeta(Integer capacidadCargaNeta) {
        this.capacidadCargaNeta = capacidadCargaNeta;
    }

    public Integer getMaxPesoSoportado() {
        return maxPesoSoportado;
    }

    public void setMaxPesoSoportado(Integer maxPesoSoportado) {
        this.maxPesoSoportado = maxPesoSoportado;
    }

    public Pallets getPallets() {
        return pallets;
    }

    public void setPallets(Pallets pallets) {
        this.pallets = pallets;
    }

    public Integer getGanchos() {
        return ganchos;
    }

    public void setGanchos(Integer ganchos) {
        this.ganchos = ganchos;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public String getTipoPuerta() {
        return tipoPuerta;
    }

    public void setTipoPuerta(String tipoPuerta) {
        this.tipoPuerta = tipoPuerta;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    public String getPalaHidraulica() {
        return palaHidraulica;
    }

    public void setPalaHidraulica(String palaHidraulica) {
        this.palaHidraulica = palaHidraulica;
    }

    public String getEquipoTermico() {
        return equipoTermico;
    }

    public void setEquipoTermico(String equipoTermico) {
        this.equipoTermico = equipoTermico;
    }

}
