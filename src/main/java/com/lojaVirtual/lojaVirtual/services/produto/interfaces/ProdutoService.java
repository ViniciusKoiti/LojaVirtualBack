package com.lojaVirtual.lojaVirtual.services.produto.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.ProdutoDTO;

@Service
public interface ProdutoService {
    List<ProdutoDTO> buscaProdutoDTOs();

    ProdutoDTO getProdutoById(long id);

    boolean criarProduto(ProdutoDTO categoria);

    boolean deletaProduto(int id);
}
