package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProdutoDTO {
    
    private long id;

    private String descricaoCurta;

    private String descricaoDetalhada;

    private double valorCusto;

    private double valorVenda;

    private MarcaDTO marca;

    private CategoriaDTO categoria;

    private List<ProdutoImagensDTO> produtosImagens;

}
