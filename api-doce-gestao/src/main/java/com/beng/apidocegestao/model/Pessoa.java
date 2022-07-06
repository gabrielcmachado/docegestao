package com.beng.apidocegestao.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPessoa;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private Timestamp createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private LocalDateTime updateTime;
    @Column(length = 120)
    private String nmPessoa;
    @Column(length = 18)
    private String cpfCnpj;
    @Column(length = 30)
    private String rgIe;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime dtNascimento;
    @Column(length = 120)
    private String email;
    @Column(length = 20)
    private String telefone1;
    @Column(length = 20)
    private String telefone2;
    @Column(length = 20)
    private String whatsapp;
    private Boolean stAtivo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pessoa")
    @JsonManagedReference
    private List<EnderecoPessoa> enderecoPessoa = new ArrayList<>();

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
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

    public Boolean getStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(Boolean stAtivo) {
        this.stAtivo = stAtivo;
    }

    public List<EnderecoPessoa> getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(List<EnderecoPessoa> enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }
}
