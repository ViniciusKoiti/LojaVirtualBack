package com.lojaVirtual.lojaVirtual.dto;


import lombok.Data;

@Data
public class CidadeDTO {
    private long id;
    private String nome;
    private EstadoDTO estadoDTO;

}
