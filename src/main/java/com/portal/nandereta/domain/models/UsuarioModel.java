/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.domain.models;

import com.fasterxml.jackson.annotation.JsonView;
import com.portal.nandereta.web.helpers.UserJsonView;

/**
 *
 * @author juan.corvalan
 */
public class UsuarioModel {
    
    @JsonView(UserJsonView.UserInNews.class)    
    private long idUsuario;    
    
    @JsonView(UserJsonView.UserInNews.class)
    private String nombreUsuario;
    
    private String contrasenia;
    
    @JsonView(UserJsonView.UserInNews.class)
    private String correoElectronico;
    
    private String edad;

    public UsuarioModel(long idUsuario, String nombreUsuario, String contrasenia, String correoElectronico, String edad) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

    public UsuarioModel() {
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    
    
}
