package com.Senai.projetoSa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Senai.projetoSa.entities.UsuarioEntity;


@Repository

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{
    
}
