/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.domain.services;

import com.portal.nandereta.domain.models.UsuarioModel;
import com.portal.nandereta.domain.repositories.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan.corvalan
 */
@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<UsuarioModel> obtenerTodos() {
        return usuarioRepository.obtenerTodos();
    }
    
    public Optional<UsuarioModel> obtenerPorCorreoOUsuario(String correo, String nomUsuario) {
        return usuarioRepository.obtenerPorCorreoOUsuario(correo, nomUsuario);
    }
    
    public Optional<UsuarioModel> obtenerPorId(long idUsuario) {
        return usuarioRepository.obtenerPorId(idUsuario);
    }
    
}
