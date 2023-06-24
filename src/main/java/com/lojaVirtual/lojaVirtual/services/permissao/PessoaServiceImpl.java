package com.lojaVirtual.lojaVirtual.services.permissao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.PessoaDTO;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Override
    public List<PessoaDTO> buscaPessoas() {
        List<Produto> produtos = produtosRepository.findAll();
        List<ProdutoDTO> produtoDTO = new ArrayList<>();
        for (Produto produto: produtos) {
            produtoDTO.add(produto.paraDTO(produto));
        }
        return cidadesDTO;
    }

    @Override
    public PessoaDTO buscaPessoaPorId(long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        
        Produto produto = produtoOptional.get();
        
        ProdutoDTO produtoDTO = produto.paraDTO(produto);
        return produtoDTO;
    }

    @Override
    public boolean criarPessoa(PessoaDTO pessoaDTO) {
        Produto produto = produtoDTO.paraEntidade(produtoDTO);
        produtoDTO.setDateAlteracao(new Date());
        produtosRepository.saveAndFlush(produto);        
        return true;
    }

    @Override
    public boolean deletarPessoa(long id) {
        try{
            Produto produto = produtoRepository.getReferenceById(id);
            produtoRepository.delete(produto);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }

   
    
}
