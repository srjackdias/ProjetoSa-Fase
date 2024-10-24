package com.Senai.projetoSa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Senai.projetoSa.entities.TrabalhadoSolicitadoEntity;


@Repository
public interface TrabalhoSolicitadoRepository extends JpaRepository<TrabalhadoSolicitadoEntity,Long> {
    
}
