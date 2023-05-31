package com.lojaVirtual.lojaVirtual.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProdutoImagens extends EntidadeBase {
    
    private String nome;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;


}
