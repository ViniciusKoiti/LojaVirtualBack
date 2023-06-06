package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.dto.PermissaoDTO;
import com.lojaVirtual.lojaVirtual.entities.Permissao;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PermissaoService;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController implements ControllerCRUD<PermissaoDTO> {

    @Autowired
    private PermissaoService permissaoService;

    @Override
    public List<PermissaoDTO> buscarTodos() {
        return permissaoService.buscaPermissaoDTOs();
    }

    @Override
    public PermissaoDTO buscarPorId(long id) {
        return permissaoService.buscaPermissaoPorId(id);
    }

    @Override
    public boolean criar(PermissaoDTO objeto) {
        return permissaoService.criarPermissao(objeto);
    }

    @Override
    public boolean deletar(long id) {
        return permissaoService.deletarPermissao(id);
    }

}
