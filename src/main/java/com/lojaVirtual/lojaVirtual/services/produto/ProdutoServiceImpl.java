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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdutoById'");
    }

    @Override
    public boolean criarProduto(ProdutoDTO categoria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarProduto'");
    }

    @Override
    public boolean deletaProduto(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletaProduto'");
    }
    
}
