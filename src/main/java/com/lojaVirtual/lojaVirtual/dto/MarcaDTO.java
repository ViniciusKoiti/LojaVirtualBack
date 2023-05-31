package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import lombok.Data;
@Data
public class MarcaDTO{

    private long id;

    private String nome;

    private List<ProdutoDTO> produtos;

}