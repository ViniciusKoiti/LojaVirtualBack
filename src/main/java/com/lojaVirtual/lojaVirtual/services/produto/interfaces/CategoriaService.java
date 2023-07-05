package com.lojaVirtual.lojaVirtual.services.produto.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.CategoriaDTO;

@Service
public interface CategoriaService {

    ResponseEntity<List<CategoriaDTO>> buscaCategorias();

    CategoriaDTO getCategoriaById(long id);

    boolean criarCategoria(CategoriaDTO categoria);

    boolean deletaCategoria(long id);
}
