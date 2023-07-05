package com.lojaVirtual.lojaVirtual.services.produto.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.MarcaDTO;

@Service
public interface MarcaService {

    ResponseEntity<List<MarcaDTO>> buscaMarcaDTOs();

    MarcaDTO getMarcaById(long id);

    boolean criarMarca(MarcaDTO marca);

    boolean deletaMarca(long id);
}
