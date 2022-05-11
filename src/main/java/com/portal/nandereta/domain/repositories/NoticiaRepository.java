/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.domain.repositories;

import com.portal.nandereta.domain.models.NoticiaModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author juan.corvalan
 */
public interface NoticiaRepository {
    
    public List<NoticiaModel> obtenerTodos();
    public Optional<NoticiaModel> obtenerPorId(long idNoticia);
    public NoticiaModel guardarNoticia(NoticiaModel noticia);
    
}
