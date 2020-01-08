package com.aercio.springtestecrud.controller;

import com.aercio.springtestecrud.repository.PessoasRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/Pessoas"})
public class PessoasController {

    private PessoasRepository repository;

    PessoasController(PessoasRepository RepositorioPessoas){
        this.repository = RepositorioPessoas;
    }
}
