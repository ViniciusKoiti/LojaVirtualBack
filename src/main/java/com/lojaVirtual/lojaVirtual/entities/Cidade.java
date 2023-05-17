package com.lojaVirtual.lojaVirtual.entities;


import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "CIDADE")
public class Cidade extends EntidadeBase {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String nome;

    public CidadeDTO paraDTO(Cidade cidade){
        CidadeDTO cidadeDTO = new CidadeDTO();
        cidadeDTO.setNome(cidade.getNome());
        return cidadeDTO;
    }
}
