package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PermissaoDTO {
    private long id;

    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "nome não pode ser vazio")
    private String nome;

    private List<PermissaoPessoaDTO> permissaoPessoa;
}
