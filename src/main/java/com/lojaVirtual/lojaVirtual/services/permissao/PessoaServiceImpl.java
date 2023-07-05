package com.lojaVirtual.lojaVirtual.services.permissao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.lojaVirtual.lojaVirtual.entities.Pessoa;
import com.lojaVirtual.lojaVirtual.repository.PessoaRepository;
import com.lojaVirtual.lojaVirtual.utils.UtilDTO;
import com.lojaVirtual.lojaVirtual.utils.UtilEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.PessoaDTO;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PessoaService;
import com.lojaVirtual.lojaVirtual.services.produto.ProdutoServiceImpl;

@Service
public class PessoaServiceImpl implements PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }
    @Override
    public List<PessoaDTO> buscaPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        List<PessoaDTO> pessoaDTO = new ArrayList<>();
        for (Pessoa pessoa: pessoas) {
            pessoaDTO.add(UtilDTO.convertToDTO(pessoa,PessoaDTO.class));
        }
        return pessoaDTO;
    }

    @Override
    public PessoaDTO buscaPessoaPorId(long id) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);
        
        Pessoa pessoa = pessoaOptional.get();
        
        PessoaDTO pessoaDTO = UtilDTO.convertToDTO(pessoa,PessoaDTO.class);
        return pessoaDTO;
    }

    @Override
    public boolean criarPessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoa = UtilEntity.convertToEntity(pessoaDTO, Pessoa.class);
        pessoa.setDateAlteracao(new Date());
        pessoaRepository.saveAndFlush(pessoa);
        return true;
    }

    @Override
    public boolean deletarPessoa(long id) {
        try{
            Optional<Pessoa> pessoa = pessoaRepository.findById(id);
            pessoaEstaPresente(pessoa);
            pessoaRepository.delete(pessoa.get());
            return true;
        } catch(Exception e) {
            throw e;
        }
    }

    public List<PessoaDTO> encontraPessoaCidade(Long cidade_id){
        Optional<List<Pessoa>> pessoas = pessoaRepository.findByCidade_Id(cidade_id);
        List<PessoaDTO> pessoaDTO = new ArrayList<>();
        listaDePessoaPresente(pessoas);
        for (Pessoa pessoa: pessoas.get()) {
            pessoaDTO.add(UtilDTO.convertToDTO(pessoa,PessoaDTO.class));
        }
        return pessoaDTO;
    }

    public List<PessoaDTO> encontraPessoasComPermissao(Long permissao_id){
        Optional<List<Pessoa>> pessoas = pessoaRepository.findByPermissaoPessoa_Permissao_Id(permissao_id);
        List<PessoaDTO> pessoaDTO = new ArrayList<>();
        listaDePessoaPresente(pessoas);
        for (Pessoa pessoa: pessoas.get()) {
            pessoaDTO.add(UtilDTO.convertToDTO(pessoa,PessoaDTO.class));
        }
        return pessoaDTO;
    }

    private void pessoaEstaPresente(Optional<Pessoa> pessoa){
        if(pessoa.isPresent()){
            throw new NoSuchElementException("Pessoa não encontrada");
        }
    }

    private void listaDePessoaPresente(Optional<List<Pessoa>> pessoaLista){
        if(pessoaLista.isPresent()){
            throw new NoSuchElementException("Pessoas não encontradas");
        }
    }

   
    
}
