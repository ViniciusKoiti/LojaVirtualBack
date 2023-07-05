package com.lojaVirtual.lojaVirtual.services.endereco;

import com.lojaVirtual.lojaVirtual.dto.EstadoDTO;
import com.lojaVirtual.lojaVirtual.entities.Estado;
import com.lojaVirtual.lojaVirtual.repository.EstadoRepository;
import com.lojaVirtual.lojaVirtual.services.endereco.interfaces.EstadoService;
import com.lojaVirtual.lojaVirtual.utils.UtilEntity;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EstadoServiceImpl implements EstadoService{

    private EstadoRepository estadoRepository;

    @Override
    public List<EstadoDTO> buscaEstados() {
        List<EstadoDTO> estadoDTOs = new ArrayList();
        List<Estado> estados = estadoRepository.findAll();
        for (Estado estado : estados) {
            estadoDTOs.add(estado.paraDTO(estado));
        }
        return estadoDTOs;
    }

    @Override
    public EstadoDTO buscaEstadoPorId(long id) {
        Estado estado = estadoRepository.getReferenceById(id);
        return estado.paraDTO(estado);
    }

    @Override
    public boolean criarEstado(EstadoDTO estadoDTO) {
        try{
        Estado estado = UtilEntity.convertToEntity(estadoDTO, Estado.class);
        estadoRepository.saveAndFlush(estado);
        return true;
        } catch(Exception e) {
            throw e;
        }
    }

    @Override
    public boolean deletarEstado(long id) {
        try{
            Estado estado = estadoRepository.getReferenceById(id);
            estadoRepository.delete(estado);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }
}
