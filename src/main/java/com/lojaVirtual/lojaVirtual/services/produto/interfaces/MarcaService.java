package com.lojaVirtual.lojaVirtual.services.produto.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.MarcaDTO;

@Service
public interface MarcaService {

    List<MarcaDTO> buscaMarcaDTOs();

    MarcaDTO getMarcaById(long id);

    boolean criarMarca(MarcaDTO marca);

    boolean deletaMarca(int id);
}
