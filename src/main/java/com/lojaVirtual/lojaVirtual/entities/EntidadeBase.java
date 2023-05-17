package com.lojaVirtual.lojaVirtual.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.sql.Date;

@Data
@MappedSuperclass
public class EntidadeBase {

    @Column(name="DATA_CRIACAO")
    private Date dateCriacao;
    @Column(name="DATA_ALTERACAO")
    private Date dateAlteracao;


}
