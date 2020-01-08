package com.aercio.springtestecrud.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pessoas {

    private Long idConta;

    @idPessoa
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;

    private Double limiteSaqueDiario;
    private Double saldo;
    private Long flagAtivo;
    private Long tipoConta;
    private String dataCriacao;

}
