package com.lojaVirtual.lojaVirtual.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaVirtual.lojaVirtual.entities.Cidade;
import com.lojaVirtual.lojaVirtual.entities.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    Optional<List<Pessoa>> findByCidade_Id(Long id);

    Optional<List<Pessoa>> findByPermissaoPessoa_Permissao_Id(Long id);
}
