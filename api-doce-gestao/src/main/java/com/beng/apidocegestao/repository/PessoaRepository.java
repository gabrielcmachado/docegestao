package com.beng.apidocegestao.repository;

import com.beng.apidocegestao.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

    public List<Pessoa> findPessoaByIdPessoa(Long idPessoa);

    public List<Pessoa> findPessoaByNmPessoaContainsIgnoreCase (String nmPessoa);

}
