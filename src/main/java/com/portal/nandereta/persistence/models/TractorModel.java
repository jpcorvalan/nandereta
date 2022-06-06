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
@Table(name = "tractor")
public class TractorModel extends CamionetaModel {

    private Integer capacidadTraccion;

    public TractorModel() {
    }

    public TractorModel(Integer capacidadTraccion) {
        this.capacidadTraccion = capacidadTraccion;
    }

    public TractorModel(Integer capacidadTraccion, String modalidadDeViaje, Double velMaxConCarga, Double velMaxSinCarga, Double capacidadCombustible, String formato, FechaHabilitaciones habilitaciones, Integer capacidadCargaNeta, Integer maxPesoSoportado, Pallets pallets, Integer ganchos, Integer puertas, String tipoPuerta, Medidas medidas, String palaHidraulica, String equipoTermico, Long idVehicle, String nombreEntidadSolicitante, String tipoHabilitacion, String lugarDondeOpera, String motivoSolicitud, String tipoMovil, Vencimientos vencimientos, Long nroInternoMovil, String patente, String proveedor, String tipoCombustible, Integer ejes, String telefono, Boolean gps, Integer anio, String marca, String modelo, Double peso, String tipoAltura, Medidas exterior, Medidas interior, Double tempMinEnServicio) {
        super(modalidadDeViaje, velMaxConCarga, velMaxSinCarga, capacidadCombustible, formato, habilitaciones, capacidadCargaNeta, maxPesoSoportado, pallets, ganchos, puertas, tipoPuerta, medidas, palaHidraulica, equipoTermico, idVehicle, nombreEntidadSolicitante, tipoHabilitacion, lugarDondeOpera, motivoSolicitud, tipoMovil, vencimientos, nroInternoMovil, patente, proveedor, tipoCombustible, ejes, telefono, gps, anio, marca, modelo, peso, tipoAltura, exterior, interior, tempMinEnServicio);
        this.capacidadTraccion = capacidadTraccion;
    }

    public Integer getCapacidadTraccion() {
        return capacidadTraccion;
    }

    public void setCapacidadTraccion(Integer capacidadTraccion) {
        this.capacidadTraccion = capacidadTraccion;
    }

}
