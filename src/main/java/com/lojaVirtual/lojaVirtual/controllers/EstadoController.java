package com.lojaVirtual.lojaVirtual.controllers;

import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import com.lojaVirtual.lojaVirtual.services.endereco.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstadoController implements ControllerCRUD<EstadoDTO> {

    @Autowired
    private EstadoService estadoService;

    @Override
    public List<EstadoDTO> buscarTodos() {
        return estadoService.buscaEstados();
    }

    @Override
    public ResponseEntity<EstadoDTO> buscarPorId(long id) {
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
