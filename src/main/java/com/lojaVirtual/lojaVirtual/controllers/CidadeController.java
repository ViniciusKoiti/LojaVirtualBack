package com.lojaVirtual.lojaVirtual.controllers;

import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import com.lojaVirtual.lojaVirtual.services.endereco.interfaces.CidadeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController implements ControllerCRUD<CidadeDTO> {

    private CidadeService cidadeService;


    @Override
    public List<CidadeDTO> buscarTodos() {
        return cidadeService.buscaTodasCidade();
    }

    @Override
    @GetMapping
    public CidadeDTO buscarPorId(long id) {
        return cidadeService.buscaCidadePorId(id);
    }

    @Override
    public boolean criar(CidadeDTO cidadeDTO) {
        return cidadeService.criarCidade(cidadeDTO);
    }

    @Override
    public boolean deletar(long id) {
        return cidadeService.deletarCidade(id);
    }
}
