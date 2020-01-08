package com.aercio.springtestecrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConta")
    private Long id;

    private Long idPessoa;

    private Double limiteSaqueDiario;
    private Double saldo;
    private Long flagAtivo;
    private Long tipoConta;
    private String dataCriacao;

    public Long getId(){
        return id;
    }

    public Long getIdPessoa(){
        return idPessoa;
    }

    public Double getLimiteSaqueDiario(){
        return limiteSaqueDiario;
    }

    public Double getSaldo(){
        return saldo;
    }

    public Long getFlagAtivo(){
        return flagAtivo;
    }

    public Long getTipoConta(){
        return tipoConta;
    }

    public String getDataCriacao(){
        return dataCriacao;
    }

    public void setIdPessoa(Long idPessoa){
        this.idPessoa = idPessoa;
    }

    public void setLimiteSaqueDiario(Double limiteSaqueDiario){
        this.limiteSaqueDiario = limiteSaqueDiario;
    }

    public void setSaldo(double Saldo){
        this.saldo = Saldo;
    }

    public void setFlagAtivo(Long flagAtivo){
        this.flagAtivo = flagAtivo;
    }

    public void setTipoConta(Long tipoConta){
        this.tipoConta = tipoConta;
    }

    public void setDataCriacao(String dataCriacao){
        this.dataCriacao = dataCriacao;
    }



}
