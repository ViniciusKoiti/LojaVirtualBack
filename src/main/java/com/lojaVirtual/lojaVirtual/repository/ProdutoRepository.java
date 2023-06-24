package com.lojaVirtual.lojaVirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaVirtual.lojaVirtual.entities.Produto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
