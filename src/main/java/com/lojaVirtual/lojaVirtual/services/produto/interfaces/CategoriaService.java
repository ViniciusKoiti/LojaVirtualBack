package com.lojaVirtual.lojaVirtual.services.produto.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.CategoriaDTO;

@Service
public interface CategoriaService {

    List<CategoriaDTO> buscaCategorias();

    CategoriaDTO getCategoriaById(long id);

    boolean criarCategoria(CategoriaDTO categoria);

    boolean deletaCategoria(int id);
}
