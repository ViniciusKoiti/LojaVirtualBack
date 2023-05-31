package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import lombok.Data;

@Data
public class PermissaoDTO {
    private long id;

    private String name;

    private List<PermissaoPessoaDTO> permissaoPessoa;
}
