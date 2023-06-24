package com.lojaVirtual.lojaVirtual.services.produto;

import java.util.List;

import com.lojaVirtual.lojaVirtual.dto.CategoriaDTO;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.CategoriaService;
@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriasRepository;

    @Override
    public List<CategoriaDTO> buscaCategorias() {
        List<Categoria> categorias = categoriasRepository.findAll();
        List<CategoriaDTO> categoriaDTO = new ArrayList<>();
        for (Categoria categoria: categorias) {
            categoriaDTO.add(categoria.paraDTO(categoria));
        }
        return cidadesDTO;
    }

    @Override
    public CategoriaDTO getCategoriaById(long id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        
        Categoria categoria = categoriaOptional.get();
        
        CategoriaDTO categoriaDTO = cidade.paraDTO(cidade);
        return categoriaDTO;
    }

    @Override
    public boolean criarCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaDTO.paraEntidade(categoriaDTO);
        categoriaDTO.setDateAlteracao(new Date());
        categoriasRepository.saveAndFlush(cidade);        
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
