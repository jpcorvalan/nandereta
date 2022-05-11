/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.domain.services;

import com.portal.nandereta.domain.models.NoticiaModel;
import com.portal.nandereta.domain.repositories.NoticiaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan.corvalan
 */
@Service
public class NoticiaService {
    
    @Autowired
    private NoticiaRepository noticiaRepository;
    
    public List<NoticiaModel> obtenerTodos() {
        return noticiaRepository.obtenerTodos();
    }
    
    public Optional<NoticiaModel> obtenerPorId(long idNoticia) {
        return noticiaRepository.obtenerPorId(idNoticia);
    }
    
    public NoticiaModel guardarNoticia(NoticiaModel noticia) {
        return noticiaRepository.guardarNoticia(noticia);
    }
    
}
