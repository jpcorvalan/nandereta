/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portal.nandereta.persistence.repositories;

import com.portal.nandereta.persistence.models.UserModel;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juan.corvalan
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<UserModel, Long> {
    public Optional<UserModel> findByEmailOrUsername(String email, String username);
}
