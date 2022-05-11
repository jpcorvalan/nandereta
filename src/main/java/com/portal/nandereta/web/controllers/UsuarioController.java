/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.web.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.portal.nandereta.domain.models.UsuarioModel;
import com.portal.nandereta.domain.services.UsuarioService;
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
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping()
    public ResponseEntity<List<UsuarioModel>> obtenerTodos(){
        return new ResponseEntity<>(usuarioService.obtenerTodos(), HttpStatus.OK);
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<UsuarioModel>> obtenerUsuarioPorId(@PathVariable("id") long idUsuario) {
        return new ResponseEntity<>(usuarioService.obtenerPorId(idUsuario), HttpStatus.OK);
    }
    
}
