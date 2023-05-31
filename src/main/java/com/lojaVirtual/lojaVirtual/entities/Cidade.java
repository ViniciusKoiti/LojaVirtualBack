package com.lojaVirtual.lojaVirtual.entities;


import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "cidade")
public class Cidade extends EntidadeBase {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String nome;

    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;

    @OneToOne(mappedBy = "pessoa")
    private Pessoa pessoa;


    public CidadeDTO paraDTO(Cidade cidade){
        CidadeDTO cidadeDTO = new CidadeDTO();
        cidadeDTO.setNome(cidade.getNome());
        return cidadeDTO;
    }
}
