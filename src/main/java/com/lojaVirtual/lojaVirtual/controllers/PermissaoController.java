package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.entities.Permissao;
import com.lojaVirtual.lojaVirtual.services.permissao.PermissaoService;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController implements ControllerCRUD<Permissao> {

    @Autowired
    private PermissaoService permissaoService;

    @Override
    public List<Permissao> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Permissao buscarPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public boolean criar(Permissao permissao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criar'");
    }

    @Override
    public boolean deletar(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    
    
}
