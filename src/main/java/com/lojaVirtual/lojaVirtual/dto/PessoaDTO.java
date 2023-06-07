package com.lojaVirtual.lojaVirtual.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class PessoaDTO {

    private String id;
    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;

    @NotNull(message = "CPF não pode ser nulo")
    @NotBlank(message = "CPF não pode ser vazio")
    private String cpf;

    @NotNull(message = "E-mail não pode ser nulo")
    @NotBlank(message = "E-mail não pode ser vazio")
    @Email(message = "E-mail não valido")
    private String email;

    @NotNull(message = "Endereço não pode ser nulo")
    @NotBlank(message = "Endereço não pode ser vazio")
    private String endereco;

    @NotNull(message = "CEP não pode ser nulo")
    @NotBlank(message = "CEP não pode ser vazio")
    private String cep;

    private CidadeDTO cidade;
    private List<PermissaoPessoaDTO> permissaoPessoa;

}
