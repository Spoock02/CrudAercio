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
public class Transacoes {

    @idTransacao
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransacao;

    private Long idConta;
    private Double valor;
    private String dataTransacao;
}
