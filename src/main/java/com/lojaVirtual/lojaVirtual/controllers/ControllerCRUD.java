package com.lojaVirtual.lojaVirtual.controllers;

import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ControllerCRUD<T> {

    List<T> buscarTodos();

    ResponseEntity<T> buscarPorId(long id);

    boolean criar(T objeto);

    boolean deletar(long id);

}
