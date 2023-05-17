package com.lojaVirtual.lojaVirtual.services.endereco;

import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EstadoService {
    List<EstadoDTO> buscaEstados();

    ResponseEntity<EstadoDTO> buscaEstadoPorId(long id);

    boolean criarEstado(EstadoDTO estadoDTO);

    boolean deletarEstado(long id);
}
