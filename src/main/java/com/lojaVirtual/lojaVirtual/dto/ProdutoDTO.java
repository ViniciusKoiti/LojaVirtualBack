package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProdutoDTO {
    
    private long id;

    @NotNull(message = "Descricao Curta não pode ser nulo")
    @NotBlank(message = "Descricao Curta não pode ser vazia")
    private String descricaoCurta;

    private String descricaoDetalhada;

    @Positive(message = "Valor do custo deve ser positivo")
    private double valorCusto;

    @Positive(message = "Valor do venda deve ser positivo")
    private double valorVenda;

    @NotNull(message = "Defina a marca")
    private MarcaDTO marca;

    @NotNull(message = "Defina a categoria")
    private CategoriaDTO categoria;

    private List<ProdutoImagensDTO> produtosImagens;

}
