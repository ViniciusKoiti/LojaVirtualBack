package com.lojaVirtual.lojaVirtual.services.permissao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.PessoaDTO;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Override
    public List<PessoaDTO> buscaPessoas() {
        List<Pessoa> pessoas = pessoasRepository.findAll();
        List<PessoaDTO> pessoaDTO = new ArrayList<>();
        for (Pessoa pessoa: pessoas) {
            pessoaDTO.add(pessoa.paraDTO(pessoa));
        }
        return cidadesDTO;
    }

    @Override
    public PessoaDTO buscaPessoaPorId(long id) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);
        
        Pessoa pessoa = pessoaOptional.get();
        
        PessoaDTO pessoaDTO = pessoa.paraDTO(pessoa);
        return pessoaDTO;
    }

    @Override
    public boolean criarPessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoa = pessoaDTO.paraEntidade(pessoaDTO);
        pessoaDTO.setDateAlteracao(new Date());
        pessoasRepository.saveAndFlush(pessoa);        
        return true;
    }

    @Override
    public boolean deletarPessoa(long id) {
        try{
            Pessoa pessoa = pessoaRepository.getReferenceById(id);
            pessoaRepository.delete(pessoa);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }

   
    
}
