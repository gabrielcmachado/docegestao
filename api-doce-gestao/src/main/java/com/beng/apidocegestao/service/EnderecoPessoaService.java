package com.beng.apidocegestao.service;

import com.beng.apidocegestao.model.EnderecoPessoa;
import com.beng.apidocegestao.repository.EnderecoPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnderecoPessoaService {

    @Autowired
    private EnderecoPessoaRepository repository;


}
