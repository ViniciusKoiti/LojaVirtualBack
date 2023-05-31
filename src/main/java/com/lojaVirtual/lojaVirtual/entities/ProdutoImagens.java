package com.lojaVirtual.lojaVirtual.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Data
@Entity(name = "produtoImagens")
public class ProdutoImagens extends EntidadeBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;


}
