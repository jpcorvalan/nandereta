/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.models;

import com.portal.nandereta.persistence.helperClasses.Medidas;
import com.portal.nandereta.persistence.helperClasses.Vencimientos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author juan.corvalan
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vehicle")
    private Long idVehicle;
    private String nombreEntidadSolicitante;
    private String tipoHabilitacion;
    private String lugarDondeOpera;
    private String motivoSolicitud;
    private String tipoMovil; // ingresado anteriormente
    private Vencimientos vencimientos;
    private Long nroInternoMovil;
    private String patente;
    private String proveedor;
    private String tipoCombustible;
    private Integer ejes;
    private String telefono; // o number????
    private Boolean gps; // select
    private String formato;
    private Integer anio;
    private String marca;
    private String modelo;
    private Double peso;
    private String tipoAltura;
    private Medidas medidas;
    private Double tempMinEnServicio;

    public VehicleModel() {
    }

    public VehicleModel(Long idVehicle, String nombreEntidadSolicitante, String tipoHabilitacion, String lugarDondeOpera, String motivoSolicitud, String tipoMovil, Vencimientos vencimientos, Long nroInternoMovil, String patente, String proveedor, String tipoCombustible, Integer ejes, String telefono, Boolean gps, String formato, Integer anio, String marca, String modelo, Double peso, String tipoAltura, Medidas medidas, Double tempMinEnServicio) {
        this.idVehicle = idVehicle;
        this.nombreEntidadSolicitante = nombreEntidadSolicitante;
        this.tipoHabilitacion = tipoHabilitacion;
        this.lugarDondeOpera = lugarDondeOpera;
        this.motivoSolicitud = motivoSolicitud;
        this.tipoMovil = tipoMovil;
        this.vencimientos = vencimientos;
        this.nroInternoMovil = nroInternoMovil;
        this.patente = patente;
        this.proveedor = proveedor;
        this.tipoCombustible = tipoCombustible;
        this.ejes = ejes;
        this.telefono = telefono;
        this.gps = gps;
        this.formato = formato;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tipoAltura = tipoAltura;
        this.medidas = medidas;
        this.tempMinEnServicio = tempMinEnServicio;
    }

    public Long getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(Long idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getNombreEntidadSolicitante() {
        return nombreEntidadSolicitante;
    }

    public void setNombreEntidadSolicitante(String nombreEntidadSolicitante) {
        this.nombreEntidadSolicitante = nombreEntidadSolicitante;
    }

    public String getTipoHabilitacion() {
        return tipoHabilitacion;
    }

    public void setTipoHabilitacion(String tipoHabilitacion) {
        this.tipoHabilitacion = tipoHabilitacion;
    }

    public String getLugarDondeOpera() {
        return lugarDondeOpera;
    }

    public void setLugarDondeOpera(String lugarDondeOpera) {
        this.lugarDondeOpera = lugarDondeOpera;
    }

    public String getMotivoSolicitud() {
        return motivoSolicitud;
    }

    public void setMotivoSolicitud(String motivoSolicitud) {
        this.motivoSolicitud = motivoSolicitud;
    }

    public String getTipoMovil() {
        return tipoMovil;
    }

    public void setTipoMovil(String tipoMovil) {
        this.tipoMovil = tipoMovil;
    }

    public Vencimientos getVencimientos() {
        return vencimientos;
    }

    public void setVencimientos(Vencimientos vencimientos) {
        this.vencimientos = vencimientos;
    }

    public Long getNroInternoMovil() {
        return nroInternoMovil;
    }

    public void setNroInternoMovil(Long nroInternoMovil) {
        this.nroInternoMovil = nroInternoMovil;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Integer getEjes() {
        return ejes;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTipoAltura() {
        return tipoAltura;
    }

    public void setTipoAltura(String tipoAltura) {
        this.tipoAltura = tipoAltura;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    public Double getTempMinEnServicio() {
        return tempMinEnServicio;
    }

    public void setTempMinEnServicio(Double tempMinEnServicio) {
        this.tempMinEnServicio = tempMinEnServicio;
    }

}
