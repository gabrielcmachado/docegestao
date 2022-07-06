package com.beng.apidocegestao.service;
import com.beng.apidocegestao.dto.EnderecoNovoDTO;
import com.beng.apidocegestao.dto.PessoaNovaDTO;
import com.beng.apidocegestao.model.EnderecoPessoa;
import com.beng.apidocegestao.model.Pessoa;
import com.beng.apidocegestao.model.TipoEnderecoEnum;
import com.beng.apidocegestao.repository.PessoaRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public void criarNovaPessoa(PessoaNovaDTO pessoaNovaDTO){
        Pessoa pessoa = new Pessoa();
        pessoa.setNmPessoa(pessoaNovaDTO.getNmPessoa());
        pessoa.setCpfCnpj(pessoaNovaDTO.getCpfCnpj());
        pessoa.setRgIe(pessoaNovaDTO.getRgIe());
        pessoa.setDtNascimento(pessoaNovaDTO.getDtNascimento());
        pessoa.setEmail(pessoaNovaDTO.getEmail());
        pessoa.setTelefone1(pessoaNovaDTO.getTelefone1());
        pessoa.setTelefone2(pessoaNovaDTO.getTelefone2());
        pessoa.setWhatsapp(pessoaNovaDTO.getWhatsapp());
        pessoa.setStAtivo(true);
        repository.save(pessoa);
        System.out.println(pessoa);
        EnderecoPessoa enderecoPessoa = new EnderecoPessoa();
        pessoaNovaDTO.getEnderecoNovoDTO().get(0).getEndereco();
        enderecoPessoa.setEndereco(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getEndereco());
        enderecoPessoa.setNumero(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getNumero());
        enderecoPessoa.setComplemento(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getComplemento());
        enderecoPessoa.setBairro(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getBairro());
        enderecoPessoa.setCidade(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getCidade());
        enderecoPessoa.setUf(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getUf());
        enderecoPessoa.setCep(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getCep());
        enderecoPessoa.setContato(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getContato());
        enderecoPessoa.setTelefone_contato(pessoaNovaDTO.getEnderecoNovoDTO().get(0).getTelefone_contato());
        enderecoPessoa.setStAtivo(true);
        enderecoPessoa.setTipoEndereco(TipoEnderecoEnum.PRINCIPAL);
        enderecoPessoa.setPessoa(repository.getReferenceById(pessoa.getIdPessoa()));
        System.out.println(enderecoPessoa);
        pessoa.getEnderecoPessoa().add(enderecoPessoa);
        repository.flush();
    }
}
