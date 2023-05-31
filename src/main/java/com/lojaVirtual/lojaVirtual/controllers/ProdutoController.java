package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lojaVirtual.lojaVirtual.dto.ProdutoDTO;
import com.lojaVirtual.lojaVirtual.services.ProdutoService;

public class ProdutoController implements ControllerCRUD<ProdutoDTO>{

    @Autowired
    private ProdutoService produtoService;

    @Override
    public List<ProdutoDTO> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public ProdutoDTO buscarPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public boolean criar(ProdutoDTO objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criar'");
    }

    @Override
    public boolean deletar(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }
    
}
