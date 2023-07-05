package com.lojaVirtual.lojaVirtual.services.produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.lojaVirtual.lojaVirtual.dto.CategoriaDTO;
import com.lojaVirtual.lojaVirtual.entities.Categoria;
import com.lojaVirtual.lojaVirtual.repository.CategoriaRepository;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.CategoriaService;
import com.lojaVirtual.lojaVirtual.utils.UtilDTO;
import com.lojaVirtual.lojaVirtual.utils.UtilEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Override
    public ResponseEntity<List<CategoriaDTO>> buscaCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        List<CategoriaDTO> categoriaDTO = new ArrayList<>();
        for (Categoria categoria: categorias) {
            categoriaDTO.add(UtilDTO.convertToDTO(categoria, CategoriaDTO.class));
        }
        return new ResponseEntity<List<CategoriaDTO>>(categoriaDTO, HttpStatus.OK);
    }

    @Override
    public CategoriaDTO getCategoriaById(long id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        
        Categoria categoria = categoriaOptional.get();
        
        CategoriaDTO categoriaDTO = UtilDTO.convertToDTO(categoria,CategoriaDTO.class);
        return categoriaDTO;
    }

    @Override
    public boolean criarCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = UtilEntity.convertToEntity(categoriaDTO,Categoria.class);
        categoria.setDateAlteracao(new Date());
        categoriaRepository.saveAndFlush(categoria);
        return true;
    }

    @Override
    public boolean deletaCategoria(long id) {
       try{
            Categoria categoria = categoriaRepository.getReferenceById(id);
            categoriaRepository.delete(categoria);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }
    
}
