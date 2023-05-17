package com.lojaVirtual.lojaVirtual.services.endereco;

import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import com.lojaVirtual.lojaVirtual.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstadoServiceImpl implements EstadoService{

    @Autowired
    private EstadoRepository estadoRepository;
    @Override
    public List<EstadoDTO> buscaEstados() {


        return null;
    }

    @Override
    public ResponseEntity<EstadoDTO> buscaEstadoPorId(long id) {
        return null;
    }

    @Override
    public boolean criarEstado(EstadoDTO estadoDTO) {
        return false;
    }

    @Override
    public boolean deletarEstado(long id) {
        return false;
    }
}
