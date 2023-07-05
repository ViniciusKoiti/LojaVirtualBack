package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lojaVirtual.lojaVirtual.dto.ProdutoDTO;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.ProdutoService;

public class ProdutoController implements ControllerCRUD<ProdutoDTO>{

    private ProdutoService produtoService;

    public ProdutoController(
        ProdutoService produtoService
    ){
        this.produtoService = produtoService;
    }

    @Override
    public List<ProdutoDTO> buscarTodos() {
       return produtoService.buscaProdutoDTOs();
    }

    @Override
    public ProdutoDTO buscarPorId(long id) {
        return produtoService.getProdutoById(id);
    }

    @Override
    public boolean criar(ProdutoDTO objeto) {
        return produtoService.criarProduto(objeto);
    }

    @Override
    public boolean deletar(long id) {
        return produtoService.deletaProduto(id);
    }
    
}
