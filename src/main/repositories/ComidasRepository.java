package com.example.comidas.repositories;

import com.example.comidas.Entities.example;
import org.springframeword.data.domain.page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface ComidasRepository extends JpaRepository<ComidasEntities, UUID>{

    Page<ComidasEntity> findAllByComidasNameContaining(String ComidasName, Pageable pageable);

    @Override
    Page<ComidasEntity> findAll(Pageable pageable);
}

