package com.lojaVirtual.lojaVirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaVirtual.lojaVirtual.entities.Marca;
@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
