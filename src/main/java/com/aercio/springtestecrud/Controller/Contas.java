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
public class Contas {

    @idPessoa
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;


    private String nome;
    private String cpf;
    private String dataNascimento;
}
