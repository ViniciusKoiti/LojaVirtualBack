package com.lojaVirtual.lojaVirtual.services.endereco.interfaces;

import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;

import java.util.List;

import org.springframework.http.ResponseEntity;


public interface CidadeService {
    CidadeDTO buscaCidadePorId(long id);

    ResponseEntity<List<CidadeDTO>> buscaTodasCidade();

    boolean criarCidade(CidadeDTO cidadeDTO);

    boolean deletarCidade(long id);
}
