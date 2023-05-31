package com.lojaVirtual.lojaVirtual.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Data
@Entity(name = "produto")
public class Produto extends EntidadeBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String descricaoCurta;

    @Column
    private String descricaoDetalhada;

    @Column 
    private double valorCusto;

    @Column
    private double valorVenda;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany
    private List<ProdutoImagens> produtosImagens;
}
