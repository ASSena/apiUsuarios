package com.ApApi.apiapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApApi.apiapi.model.usuarioModel;

@Repository
public interface userRepository extends JpaRepository<usuarioModel, UUID>{

}
