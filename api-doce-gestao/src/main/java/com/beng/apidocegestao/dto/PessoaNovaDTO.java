package com.beng.apidocegestao.dto;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PessoaNovaDTO {
    private String nmPessoa;
    private String cpfCnpj;
    private String rgIe;
    private LocalDateTime dtNascimento;
    private String email;
    private String telefone1;
    private String telefone2;
    private String whatsapp;
    private List<EnderecoNovoDTO> enderecoNovoDTO = new ArrayList<>();

    public List<EnderecoNovoDTO> getEnderecoNovoDTO() {
        return enderecoNovoDTO;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    public LocalDateTime getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDateTime dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
