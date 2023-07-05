package com.lojaVirtual.lojaVirtual.services.permissao.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lojaVirtual.lojaVirtual.dto.PermissaoDTO;

public interface PermissaoService {
    
    ResponseEntity<List<PermissaoDTO>> buscaPermissaoDTOs();

    PermissaoDTO buscaPermissaoPorId(long id);

    boolean criarPermissao(PermissaoDTO estadoDTO);

    boolean deletarPermissao(long id);
}
