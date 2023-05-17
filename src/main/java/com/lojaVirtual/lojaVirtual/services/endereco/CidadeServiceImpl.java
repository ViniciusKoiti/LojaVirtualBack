package com.lojaVirtual.lojaVirtual.services.endereco;


import com.lojaVirtual.lojaVirtual.dto.CidadeDTO;
import com.lojaVirtual.lojaVirtual.entities.Cidade;
import com.lojaVirtual.lojaVirtual.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CidadeServiceImpl implements CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;
    @Override
    public CidadeDTO buscaCidadePorId(long id) {
        Optional<Cidade> cidadeOptional = cidadeRepository.findById(id);
        Cidade cidade = cidadeOptional.get();
        CidadeDTO cidadeDTO = cidade.paraDTO(cidade);
        return cidadeDTO;
    }

    @Override
    public List<CidadeDTO> buscaTodasCidade() {
        List<Cidade> cidades = cidadeRepository.findAll();
        List<CidadeDTO> cidadesDTO = new ArrayList<>();
        for (Cidade cidade: cidades) {
            cidadesDTO.add(cidade.paraDTO(cidade));
        }
        return cidadesDTO;
    }

    @Override
    public boolean criarCidade(CidadeDTO cidadeDTO) {
        return false;
    }

    @Override
    public boolean deletarCidade(long id) {
        return false;
    }
}
