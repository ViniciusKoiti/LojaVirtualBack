package com.lojaVirtual.lojaVirtual.services.produto;

import java.util.List;

import com.lojaVirtual.lojaVirtual.dto.ProdutoDTO;
import com.lojaVirtual.lojaVirtual.services.produto.interfaces.ProdutoService;
@Service
public class ProdutoServiceImpl implements ProdutoService{

    private final ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoDTO> buscaProdutoDTOs() {
        List<Produto> produtos = produtoRepository.findAll();
        List<ProdutoDTO> produtosDTO = new ArrayList<>();
        for (Produto produto: produtos) {
            produtosDTO.add(produto.paraDTO(produto));
        }
        return produtosDTO;
    }

    @Override
    public ProdutoDTO getProdutoById(long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        
        Produto produto = produtoOptional.get();
        
        ProdutoDTO produtoDTO = produto.paraDTO(produto);
        return produtoDTO;
    }

    @Override
    public boolean criarProduto(ProdutoDTO categoria) {
        Produto produto = produtoDTO.paraEntidade(produtoDTO);
        produtoDTO.setDateAlteracao(new Date());
        produtoRepository.saveAndFlush(produto);        
        return true;
    }

    @Override
    public boolean deletaProduto(int id) {
       try{
            Produto produto = produtoRepository.getReferenceById(id);
            produtoRepository.delete(produto);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }
    
}
