/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portal.nandereta.domain.repositories;

import com.portal.nandereta.domain.models.UsuarioModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author juan.corvalan
 */
public interface UsuarioRepository {
    public List<UsuarioModel> obtenerTodos();
    public Optional<UsuarioModel> obtenerPorCorreoOUsuario(String correo, String nomUsuario);
    public Optional<UsuarioModel> obtenerPorId(long idUsuario);
    public UsuarioModel guardarUsuario(UsuarioModel usuario);
}
