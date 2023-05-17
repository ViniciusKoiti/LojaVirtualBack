package com.lojaVirtual.lojaVirtual.services.endereco;

import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import com.lojaVirtual.lojaVirtual.entities.Cidade;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CidadeService {
    ResponseEntity<CidadeDTO> buscaCidadePorId(long id);

    List<CidadeDTO> buscaTodasCidade();

    boolean criarCidade(CidadeDTO cidadeDTO);

    boolean deletarCidade(long id);
}
