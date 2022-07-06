package com.beng.apidocegestao.controller;

import com.beng.apidocegestao.repository.EnderecoPessoaRepository;
import com.beng.apidocegestao.service.EnderecoPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoPessoaController {

    @Autowired
    private EnderecoPessoaRepository repository;

    @Autowired
    private EnderecoPessoaService service;



}
