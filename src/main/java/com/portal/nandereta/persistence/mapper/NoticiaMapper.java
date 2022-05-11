/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portal.nandereta.persistence.mapper;

import com.portal.nandereta.domain.models.NoticiaModel;
import com.portal.nandereta.persistence.models.NewsModel;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author juan.corvalan
 */
@Mapper(componentModel = "spring", uses = {UsuarioMapper.class})
public interface NoticiaMapper {
    
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "title", target = "titulo"),
        @Mapping(source = "subtitle", target = "subtitulo"),
        @Mapping(source = "entry", target = "entrada"),
        @Mapping(source = "body", target = "cuerpo"),
        @Mapping(source = "createdBy", target = "creadoPor"),
    })
    NoticiaModel toNoticiaModel(NewsModel news);
    List<NoticiaModel> toNoticias(List<NewsModel> manyNews);
    
    @InheritInverseConfiguration
    NewsModel toNewsModel(NoticiaModel noticia);
    List<NewsModel> toManyNews(List<NoticiaModel> noticias);
    
}
