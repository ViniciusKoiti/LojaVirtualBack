package com.lojaVirtual.lojaVirtual.controllers;

import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import com.lojaVirtual.lojaVirtual.services.endereco.interfaces.EstadoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController implements ControllerCRUD<EstadoDTO> {

    private EstadoService estadoService;

    @Override
    @GetMapping
    public List<EstadoDTO> buscarTodos() {
        return estadoService.buscaEstados();
    }

    @Override
    @GetMapping("/{id}")
    @RequestMapping
    public EstadoDTO buscarPorId(@PathVariable long id) {
        return estadoService.buscaEstadoPorId(id);
    }

    @Override
    public boolean criar(@RequestBody EstadoDTO estadoDTO) {
        return estadoService.criarEstado(estadoDTO);
    }

    @Override
    public boolean deletar(long id) {
        return estadoService.deletarEstado(id);
    }
}
