package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.dto.CategoriaDTO;
import com.lojaVirtual.lojaVirtual.services.endereco.interfaces.CidadeService;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController implements ControllerCRUD<CategoriaDTO> {

    private CategoriaService categoriaService;

     public CategoriaController(
        CategoriaService categoriaService
    ){
        this.categoriaService = categoriaService;
    }

    @Override
    public List<CategoriaDTO> buscarTodos() {
        return categoriaService.buscaCategorias();
    }

    @Override
    public CategoriaDTO buscarPorId(long id) {
        return categoriaService.getCategoriaById(id);
    }

    @Override
    public boolean criar(CategoriaDTO objeto) {
       return categoriaService.criarCategoria(objeto);
    }

    @Override
    public boolean deletar(long id) {
        return categoriaService.deletaCategoria(id);
    }
    
}
