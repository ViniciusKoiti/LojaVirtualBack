package com.lojaVirtual.lojaVirtual.services.permissao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.lojaVirtual.lojaVirtual.entities.Pessoa;
import com.lojaVirtual.lojaVirtual.repository.PessoaRepository;
import com.lojaVirtual.lojaVirtual.utils.UtilDTO;
import com.lojaVirtual.lojaVirtual.utils.UtilEntity;
import org.springframework.stereotype.Service;

import com.lojaVirtual.lojaVirtual.dto.PessoaDTO;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository pessoaRepository;


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
            Pessoa pessoa = pessoaRepository.getReferenceById(id);
            pessoaRepository.delete(pessoa);
            return true;
        } catch(Exception e) {
            throw e;
        }
    }

   
    
}
