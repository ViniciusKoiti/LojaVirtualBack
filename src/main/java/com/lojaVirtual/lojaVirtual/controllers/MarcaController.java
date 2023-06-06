package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.dto.MarcaDTO;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.MarcaService;

@RestController
@RequestMapping("/api/marca")
public class MarcaController implements ControllerCRUD<MarcaDTO> {
    
    private MarcaService marcaService;

    @Override
    public List<MarcaDTO> buscarTodos() {
        return marcaService.buscaMarcaDTOs();
    }

    @Override
    public MarcaDTO buscarPorId(long id) {
        return marcaService.getMarcaById(id);
    }

    @Override
    public boolean criar(MarcaDTO objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criar'");
    }

    @Override
    public boolean deletar(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    
    
}
