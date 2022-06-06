/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portal.nandereta.persistence.services;

import com.portal.nandereta.domain.models.NoticiaModel;
import com.portal.nandereta.domain.repositories.NoticiaRepository;
import com.portal.nandereta.persistence.mapper.NoticiaMapper;
import com.portal.nandereta.persistence.models.NewsModel;
import com.portal.nandereta.persistence.repositories.NewsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan.corvalan
 */
@Service
public class NewsService implements NoticiaRepository {
    
    @Autowired
    private NewsRepository newsRepository;
    
    @Autowired
    private NoticiaMapper newsMapper;

    @Override
    public List<NoticiaModel> obtenerTodos() {
        return newsMapper.toNoticias((List<NewsModel>) newsRepository.findAll());
    }

    @Override
    public Optional<NoticiaModel> obtenerPorId(long idNews) {
        Optional<NewsModel> newsFinded = newsRepository.findById(idNews);
        
        return newsFinded.map((news) -> newsMapper.toNoticiaModel(news));
    }

    @Override
    public NoticiaModel guardarNoticia(NoticiaModel noticia) {
        NewsModel newsToSave = newsMapper.toNewsModel(noticia);
        
        return newsMapper.toNoticiaModel(newsRepository.save(newsToSave));
    }
    
}
