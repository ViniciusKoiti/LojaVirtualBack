package com.lojaVirtual.lojaVirtual.services.permissao;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.PermissaoDTO;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PermissaoService;
@Service
public class PermissaoServiceImpl implements PermissaoService {

    @Override
    public ResponseEntity<List<PermissaoDTO>> buscaPermissaoDTOs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscaPermissaoDTOs'");
    }

    @Override
    public PermissaoDTO buscaPermissaoPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscaPermissaoPorId'");
    }

    @Override
    public boolean criarPermissao(PermissaoDTO estadoDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarPermissao'");
    }

    @Override
    public boolean deletarPermissao(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarPermissao'");
    }

    
    
}
