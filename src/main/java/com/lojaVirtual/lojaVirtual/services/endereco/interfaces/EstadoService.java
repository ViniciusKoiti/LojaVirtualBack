package com.lojaVirtual.lojaVirtual.services.endereco.interfaces;

import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface EstadoService {
    ResponseEntity<List<EstadoDTO>> buscaEstados();

    EstadoDTO buscaEstadoPorId(long id);

    boolean criarEstado(EstadoDTO estadoDTO);

    boolean deletarEstado(long id);
}
