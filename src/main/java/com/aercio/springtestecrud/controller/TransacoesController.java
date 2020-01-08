package com.aercio.springtestecrud.controller;

import com.aercio.springtestecrud.repository.TransacoesRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/Transacoes"})
public class TransacoesController {

    private TransacoesRepository repository;

    TransacoesController(TransacoesRepository RepositorioTransacoes){
        this.repository = RepositorioTransacoes;
    }
}
