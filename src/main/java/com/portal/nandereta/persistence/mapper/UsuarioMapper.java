/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portal.nandereta.persistence.mapper;

import com.portal.nandereta.domain.models.UsuarioModel;
import com.portal.nandereta.persistence.models.UserModel;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author juan.corvalan
 */
@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    
    @Mappings({
        @Mapping(source = "idUser", target = "idUsuario"),            
        @Mapping(source = "username", target = "nombreUsuario"),            
        @Mapping(source = "password", target = "contrasenia"),            
        @Mapping(source = "email", target = "correoElectronico"),            
        @Mapping(source = "age", target = "edad"),
    })
    UsuarioModel toUsuarioModel(UserModel user);
    List<UsuarioModel> toUsuarios(List<UserModel> users);
    
    @InheritInverseConfiguration
    @Mapping(target = "birthday", ignore = true)
    UserModel toUserModel(UsuarioModel usuario);
    
}
