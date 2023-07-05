package com.lojaVirtual.lojaVirtual.services.produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.lojaVirtual.lojaVirtual.dto.ProdutoDTO;
import com.lojaVirtual.lojaVirtual.entities.Produto;
import com.lojaVirtual.lojaVirtual.repository.ProdutoRepository;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.ProdutoService;
import com.lojaVirtual.lojaVirtual.utils.UtilDTO;
import com.lojaVirtual.lojaVirtual.utils.UtilEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    private ProdutoRepository produtoRepository;

    @Override
    public ResponseEntity<List<ProdutoDTO>> buscaProdutoDTOs() {
        List<Produto> produtos = produtoRepository.findAll();
        List<ProdutoDTO> produtosDTO = new ArrayList<>();
        for (Produto produto: produtos) {
            produtosDTO.add(UtilDTO.convertToDTO(produto, ProdutoDTO.class));
        }
        return new ResponseEntity<List<ProdutoDTO>>(produtosDTO, HttpStatus.OK);
    }

    @Override
    public ProdutoDTO getProdutoById(long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        
        Produto produto = produtoOptional.get();
        
        ProdutoDTO produtoDTO = UtilDTO.convertToDTO(produto, ProdutoDTO.class);
        return produtoDTO;
    }

    @Override
    public boolean criarProduto(ProdutoDTO produtoDTO) {
        Produto produto = UtilEntity.convertToEntity(produtoDTO,Produto.class);
        produto.setDateAlteracao(new Date());
        produtoRepository.saveAndFlush(produto);        
        return true;
    }

    @Override
    public boolean deletaProduto(long id) {
       try{
            Produto produto = produtoRepository.getReferenceById(id);
            produtoRepository.delete(produto);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }
    
}
