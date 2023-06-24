package com.lojaVirtual.lojaVirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaVirtual.lojaVirtual.entities.Marca;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
