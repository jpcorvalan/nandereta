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
@JsonView(UserJsonView.UserInNews.class)
public class NoticiaModel {
    
    private long id;    
    private String titulo;
    private String subtitulo;
    private String entrada;
    private String cuerpo;
    private UsuarioModel creadoPor;

    public NoticiaModel(long id, String titulo, String subtitulo, String entrada, String cuerpo, UsuarioModel creadoPor) {
        this.id = id;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.entrada = entrada;
        this.cuerpo = cuerpo;
        this.creadoPor = creadoPor;
    }

    public NoticiaModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public UsuarioModel getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(UsuarioModel creadoPor) {
        this.creadoPor = creadoPor;
    }
    
}
