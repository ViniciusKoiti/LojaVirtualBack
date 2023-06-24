package com.lojaVirtual.lojaVirtual.services.produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.lojaVirtual.lojaVirtual.dto.MarcaDTO;
import com.lojaVirtual.lojaVirtual.entities.Marca;
import com.lojaVirtual.lojaVirtual.repository.MarcaRepository;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.MarcaService;
import com.lojaVirtual.lojaVirtual.utils.UtilDTO;
import com.lojaVirtual.lojaVirtual.utils.UtilEntity;
import org.springframework.stereotype.Service;

@Service
public class MarcaServiceImpl implements MarcaService {

    private MarcaRepository marcaRepository;

    @Override
    public List<MarcaDTO> buscaMarcaDTOs() {
        List<Marca> marcas = marcaRepository.findAll();
        List<MarcaDTO> marcasDTO = new ArrayList<>();
        for (Marca marca: marcas) {
            marcasDTO.add(UtilDTO.convertToDTO(marca,MarcaDTO.class));
        }
        return marcasDTO;
    }

    @Override
    public MarcaDTO getMarcaById(long id) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        
        Marca marca = marcaOptional.get();
        
        MarcaDTO marcaDTO = UtilDTO.convertToDTO(marca,MarcaDTO.class);
        return marcaDTO;
    }

    @Override
    public boolean criarMarca(MarcaDTO marcaDTO) {
        Marca marca = UtilEntity.convertToEntity(marcaDTO,Marca.class);
        marca.setDateAlteracao(new Date());
        marcaRepository.saveAndFlush(marca);        
        return true;
    }

    @Override
    public boolean deletaMarca(long id) {
       try{
            Marca marca = marcaRepository.getReferenceById(id);
            marcaRepository.delete(marca);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }
    
}
