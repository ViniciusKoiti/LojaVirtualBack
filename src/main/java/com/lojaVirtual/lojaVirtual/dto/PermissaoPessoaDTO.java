package com.lojaVirtual.lojaVirtual.dto;

import lombok.Data;

@Data
public class PermissaoPessoaDTO {
 
    private long id;

    private PermissaoDTO permissao;

    private PessoaDTO pessoa;
}
