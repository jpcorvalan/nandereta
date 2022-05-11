/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.services;

import com.portal.nandereta.domain.models.UsuarioModel;
import com.portal.nandereta.domain.repositories.UsuarioRepository;
import com.portal.nandereta.persistence.mapper.UsuarioMapper;
import com.portal.nandereta.persistence.models.UserModel;
import com.portal.nandereta.persistence.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan.corvalan
 */
@Service
public class UserService implements UsuarioRepository{
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    public List<UsuarioModel> obtenerTodos() {
        return usuarioMapper.toUsuarios((List<UserModel>) userRepository.findAll());
    }

    @Override
    public Optional<UsuarioModel> obtenerPorCorreoOUsuario(String correo, String nomUsuario) {
        Optional<UserModel> usuarioObtenido = userRepository.findByEmailOrUsername(correo, nomUsuario);
        
        return usuarioObtenido.map((usuario) -> usuarioMapper.toUsuarioModel(usuario));
    }

    @Override
    public Optional<UsuarioModel> obtenerPorId(long idUsuario) {
        Optional<UserModel> usuarioObtenido = userRepository.findById(idUsuario);
        
        return usuarioObtenido.map((usuario) -> usuarioMapper.toUsuarioModel(usuario));
    }

    @Override
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        UserModel userToSave = usuarioMapper.toUserModel(usuario);
        
        return usuarioMapper.toUsuarioModel(userRepository.save(userToSave));
    }
    
}
