package com.lojaVirtual.lojaVirtual.controllers;


import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ControllerCRUD<T> {

    ResponseEntity<List<T>> buscarTodos();

    T buscarPorId(long id);

    boolean criar(T objeto);

    boolean deletar(long id);

}
