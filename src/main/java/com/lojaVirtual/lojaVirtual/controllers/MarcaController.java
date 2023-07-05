package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.dto.MarcaDTO;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.MarcaService;

@RestController
@RequestMapping("/api/marca")
public class MarcaController implements ControllerCRUD<MarcaDTO> {
    
    private MarcaService marcaService;

    public MarcaController(
        MarcaService marcaService
    ){
        this.marcaService = marcaService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<MarcaDTO>> buscarTodos() {
        return marcaService.buscaMarcaDTOs();
    }

    @Override
    @GetMapping("/{id}")
    public MarcaDTO buscarPorId(@PathVariable long id) {
        return marcaService.getMarcaById(id);
    }

    @Override
    @PostMapping
    public boolean criar(@RequestBody MarcaDTO objeto) {
        return marcaService.criarMarca(objeto);
    }

    @Override
    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable long id) {
        return marcaService.deletaMarca(id);
    }
}
