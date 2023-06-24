package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import jakarta.validation.Valid;
import lombok.Data;
@Data
public class CategoriaDTO {
    @Valid()
    private long id;
    private String nome;
    private List<ProdutoDTO> produtosDto;

}
