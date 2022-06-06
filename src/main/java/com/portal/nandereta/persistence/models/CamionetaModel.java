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
@Table(name = "camioneta")
public class CamionetaModel extends TrailerModel {

    private String modalidadDeViaje;// (LD - CD)
    private Double velMaxConCarga;
    private Double velMaxSinCarga;
    private Double capacidadCombustible;

    public CamionetaModel() {
    }

    public CamionetaModel(String modalidadDeViaje, Double velMaxConCarga, Double velMaxSinCarga, Double capacidadCombustible) {
        this.modalidadDeViaje = modalidadDeViaje;
        this.velMaxConCarga = velMaxConCarga;
        this.velMaxSinCarga = velMaxSinCarga;
        this.capacidadCombustible = capacidadCombustible;
    }

    public CamionetaModel(String modalidadDeViaje, Double velMaxConCarga, Double velMaxSinCarga, Double capacidadCombustible, String formato, FechaHabilitaciones habilitaciones, Integer capacidadCargaNeta, Integer maxPesoSoportado, Pallets pallets, Integer ganchos, Integer puertas, String tipoPuerta, Medidas medidas, String palaHidraulica, String equipoTermico, Long idVehicle, String nombreEntidadSolicitante, String tipoHabilitacion, String lugarDondeOpera, String motivoSolicitud, String tipoMovil, Vencimientos vencimientos, Long nroInternoMovil, String patente, String proveedor, String tipoCombustible, Integer ejes, String telefono, Boolean gps, Integer anio, String marca, String modelo, Double peso, String tipoAltura, Medidas exterior, Medidas interior, Double tempMinEnServicio) {
        super(habilitaciones, capacidadCargaNeta, maxPesoSoportado, pallets, ganchos, puertas, tipoPuerta, medidas, palaHidraulica, equipoTermico, idVehicle, nombreEntidadSolicitante, tipoHabilitacion, lugarDondeOpera, motivoSolicitud, tipoMovil, vencimientos, nroInternoMovil, patente, proveedor, tipoCombustible, ejes, telefono, gps, formato, anio, marca, modelo, peso, tipoAltura, exterior, interior, tempMinEnServicio);
        this.modalidadDeViaje = modalidadDeViaje;
        this.velMaxConCarga = velMaxConCarga;
        this.velMaxSinCarga = velMaxSinCarga;
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getModalidadDeViaje() {
        return modalidadDeViaje;
    }

    public void setModalidadDeViaje(String modalidadDeViaje) {
        this.modalidadDeViaje = modalidadDeViaje;
    }

    public Double getVelMaxConCarga() {
        return velMaxConCarga;
    }

    public void setVelMaxConCarga(Double velMaxConCarga) {
        this.velMaxConCarga = velMaxConCarga;
    }

    public Double getVelMaxSinCarga() {
        return velMaxSinCarga;
    }

    public void setVelMaxSinCarga(Double velMaxSinCarga) {
        this.velMaxSinCarga = velMaxSinCarga;
    }

    public Double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(Double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

}
