package com.lojaVirtual.lojaVirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaVirtual.lojaVirtual.dto.PessoaDTO;
import com.lojaVirtual.lojaVirtual.entities.Pessoa;
import com.lojaVirtual.lojaVirtual.services.permissao.interfaces.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
@CrossOrigin
public class PessoaController implements ControllerCRUD<PessoaDTO> {
    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }
    @GetMapping("/cidade/{cidade_id}")
    public List<PessoaDTO> getPessoaDaCidade(@PathVariable Long cidade_id){
        return pessoaService.encontraPessoaCidade(cidade_id);
    }

    @GetMapping("/permissao/{id}")
    public List<PessoaDTO> getPessoaPorPermissao(@PathVariable Long permissao_id){
        return pessoaService.encontraPessoasComPermissao(permissao_id);
    }

    @Override
    @GetMapping
    public List<PessoaDTO> buscarTodos() {
        return pessoaService.buscaPessoas();
    }


    @Override

    public PessoaDTO buscarPorId(long id) {
        return pessoaService.buscaPessoaPorId(id);
    }




    @Override
    public boolean criar(PessoaDTO objeto) {
        return pessoaService.criarPessoa(objeto);
    }




    @Override
    @DeleteMapping("/{id}")
    public boolean deletar(long id) {
        return pessoaService.deletarPessoa(id);
    }


    
}
