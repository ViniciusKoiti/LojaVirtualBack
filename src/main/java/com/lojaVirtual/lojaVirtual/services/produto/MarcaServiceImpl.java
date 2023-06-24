package com.lojaVirtual.lojaVirtual.services.produto;

import java.util.List;

import com.lojaVirtual.lojaVirtual.dto.MarcaDTO;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.MarcaService;
@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository; 

    @Override
    public List<MarcaDTO> buscaMarcaDTOs() {
        List<Marca> marcas = marcaRepository.findAll();
        List<MarcaDTO> marcasDTO = new ArrayList<>();
        for (Marca marca: marcas) {
            marcasDTO.add(marca.paraDTO(marca));
        }
        return marcasDTO;
    }

    @Override
    public MarcaDTO getMarcaById(long id) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        
        Marca marca = marcaOptional.get();
        
        MarcaDTO marcaDTO = marca.paraDTO(marca);
        return marcaDTO;
    }

    @Override
    public boolean criarMarca(MarcaDTO marca) {
        Marca marca = marcaDTO.paraEntidade(marcaDTO);
        marcaDTO.setDateAlteracao(new Date());
        marcaRepository.saveAndFlush(marca);        
        return true;
    }

    @Override
    public boolean deletaMarca(int id) {
       try{
            Marca marca = marcaRepository.getReferenceById(id);
            marcaRepository.delete(marca);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }
    
}
