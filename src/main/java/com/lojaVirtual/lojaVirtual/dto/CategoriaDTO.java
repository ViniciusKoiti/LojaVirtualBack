package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import lombok.Data;
@Data
public class CategoriaDTO {
    private long id;
    private String nome;
    private List<ProdutoDTO> cidades;
}
