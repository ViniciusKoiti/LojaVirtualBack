package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.dto.PermissaoDTO;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PermissaoService;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController implements ControllerCRUD<PermissaoDTO> {

    private PermissaoService permissaoService;

    public PermissaoController(
        PermissaoService permissaoService
    ){
        this.permissaoService = permissaoService;
    }

    @Override
    @GetMapping
    public List<PermissaoDTO> buscarTodos() {
        return permissaoService.buscaPermissaoDTOs();
    }

    @Override
    @GetMapping("/{id}")
    public PermissaoDTO buscarPorId(@PathVariable long id) {
        return permissaoService.buscaPermissaoPorId(id);
    }

    @Override
    @PostMapping
    public boolean criar(@RequestBody PermissaoDTO objeto) {
        return permissaoService.criarPermissao(objeto);
    }

    @Override
    @DeleteMapping
    public boolean deletar(@PathVariable long id) {
        return permissaoService.deletarPermissao(id);
    }

}
