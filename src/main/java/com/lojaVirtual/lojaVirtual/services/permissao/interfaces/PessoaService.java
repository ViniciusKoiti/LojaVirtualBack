package com.lojaVirtual.lojaVirtual.services.permissao.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lojaVirtual.lojaVirtual.dto.PessoaDTO;

public interface PessoaService {

    ResponseEntity<List<PessoaDTO>> buscaPessoas();

    PessoaDTO buscaPessoaPorId(long id);

    boolean criarPessoa(PessoaDTO pessoaDTO);

    boolean deletarPessoa(long id);    

    List<PessoaDTO> encontraPessoaCidade(Long cidade_id);

    List<PessoaDTO> encontraPessoasComPermissao(Long pessoa_id);

}
