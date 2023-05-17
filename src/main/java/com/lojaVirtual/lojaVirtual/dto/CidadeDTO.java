package com.lojaVirtual.lojaVirtual.dto;


import com.lojaVirtual.lojaVirtual.entities.Cidade;
import lombok.Data;

@Data
public class CidadeDTO {
    private String nome;

    public Cidade paraEntidade(CidadeDTO cidadeDTO){
        Cidade cidade = new Cidade();
        cidade.setNome(cidadeDTO.getNome());
        return cidade;
    }
}
