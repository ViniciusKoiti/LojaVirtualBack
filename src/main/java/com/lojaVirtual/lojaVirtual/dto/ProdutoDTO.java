package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProdutoDTO {
    
    private long id;

    @NotNull(message = "Descricao Curta não pode ser nulo")
    @NotBlank(message = "Descricao Curta não pode ser vazia")
    private String descricaoCurta;

    private String descricaoDetalhada;

    @NotNull(message = "")
    private double valorCusto;

    private double valorVenda;

    private MarcaDTO marca;

    private CategoriaDTO categoria;

    private List<ProdutoImagensDTO> produtosImagens;

}
