package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.entities.Pessoa;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController implements ControllerCRUD<Pessoa> {

    private PessoaService pessoaService;

    @Override
    @GetMapping("/")
    public List<Pessoa> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Pessoa buscarPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public boolean criar(Pessoa objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criar'");
    }

    @Override
    public boolean deletar(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }
    
}
