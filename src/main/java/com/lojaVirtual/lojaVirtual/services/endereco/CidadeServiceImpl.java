package com.lojaVirtual.lojaVirtual.services.endereco;


import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CidadeServiceImpl implements CidadeService {
    @Override
    public ResponseEntity<CidadeDTO> buscaCidadePorId(long id) {
        return null;
    }

    @Override
    public List<CidadeDTO> buscaTodasCidade() {
        return null;
    }

    @Override
    public boolean criarCidade(CidadeDTO cidadeDTO) {
        return false;
    }

    @Override
    public boolean deletarCidade(long id) {
        return false;
    }
}
