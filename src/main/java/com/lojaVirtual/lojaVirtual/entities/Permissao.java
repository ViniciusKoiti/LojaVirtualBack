package com.lojaVirtual.lojaVirtual.entities;

import org.hibernate.mapping.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Data
@Entity(name = "PERMISSAO")
public class Permissao extends EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToMany
    private PermissaoPessoa permissaoPessoa;  
    
}
