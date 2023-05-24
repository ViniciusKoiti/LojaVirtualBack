package com.lojaVirtual.lojaVirtual.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PermissaoPessoa extends EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "PERMISSAO_ID")
    private Permissao permissao;

    @ManyToOne
    @JoinColumn(name="PESSOA_ID")
    private Pessoa pessoa;

}