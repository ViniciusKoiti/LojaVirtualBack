package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import lombok.Data;
@Data
public class PessoaDTO {
    private long id;
    private String name;
    private String cpf;
    private String email;
    private String endereco;
    private String cep;
    private CidadeDTO cidade;
    private List<PermissaoPessoaDTO> permissaoPessoa;
}
