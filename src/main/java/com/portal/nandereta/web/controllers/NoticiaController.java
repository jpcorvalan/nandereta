/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.web.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.portal.nandereta.domain.models.NoticiaModel;
import com.portal.nandereta.domain.services.NoticiaService;
import com.portal.nandereta.web.helpers.UserJsonView;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juan.corvalan
 */
@RestController
@RequestMapping("/noticias")
public class NoticiaController {
    
    @Autowired
    private NoticiaService noticiaService;
    
    @JsonView(UserJsonView.UserInNews.class)
    @GetMapping
    public ResponseEntity<List<NoticiaModel>> obtenerTodasLasNoticias() {
        return new ResponseEntity<>(noticiaService.obtenerTodos(), HttpStatus.OK);
    }
    
    @GetMapping("/{idNoticia}")
    public ResponseEntity<Optional<NoticiaModel>> obtenerNoticiaPorId(@PathVariable("idNoticia") long id) {
        return new ResponseEntity<>(noticiaService.obtenerPorId(id), HttpStatus.OK);
    }
    
}
