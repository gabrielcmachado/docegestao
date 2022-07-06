package com.beng.apidocegestao.controller;

import com.beng.apidocegestao.dto.PessoaNovaDTO;
import com.beng.apidocegestao.model.Pessoa;
import com.beng.apidocegestao.repository.PessoaRepository;
import com.beng.apidocegestao.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private PessoaService service;

    @PostMapping
    public void save(@RequestBody PessoaNovaDTO pessoa){
        service.criarNovaPessoa(pessoa);
    }

    @GetMapping
    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{idPessoa}")
    public List<Pessoa> findPessoaByIdPessoa (@PathVariable("idPessoa") Long idPessoa){
        return repository.findPessoaByIdPessoa(idPessoa);
    }

    @GetMapping("/nmPessoa/{nmPessoa}")
    public List<Pessoa> findPessoaByNmPessoaContainsIgnoreCase(@PathVariable("nmPessoa") String nmPessoa){
        return repository.findPessoaByNmPessoaContainsIgnoreCase(nmPessoa);
    }


}
