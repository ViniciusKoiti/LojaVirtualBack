package com.lojaVirtual.lojaVirtual.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity(name = "categoria")
public class Categoria extends EntidadeBase {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;
}
