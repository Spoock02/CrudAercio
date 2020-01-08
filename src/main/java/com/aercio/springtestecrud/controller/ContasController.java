package com.aercio.springtestecrud.controller;

import com.aercio.springtestecrud.model.Contas;
import com.aercio.springtestecrud.repository.ContasRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/Contas"})
public class ContasController {

    private ContasRepository repository;

    ContasController(ContasRepository RepositorioContas){
        this.repository = RepositorioContas;
    }

    @GetMapping
    public List<Contas> findAll(){
        return repository.findAll();
    }


    /*
        HTTP 200 (ResponseEntity.ok())
        HTTP 404 - Não Encontrado (ResponseEntity.notFound())
        TODO: findByIdConta ou findById????
     */
    @GetMapping(path = {"/{id}"})
    public ResponseEntity findByIdConta(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Contas createConta(@RequestBody Contas contas){
        return repository.save(contas);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateConta(@PathVariable("id"),long id, @RequestBody Contas Contas){
        return repository.findById(id)
                .map(record -> {
                    record.setLimiteSaqueDiario(Contas.getLimiteSaqueDiario());
                    record.setSaldo(Contas.getSaldo());
                    record.setFlagAtivo(Contas.getFlagAtivo());
                    record.setTipoConta(Contas.getTipoConta());
                    record.setDataCriacao(Contas.getDataCriacao());
                    record.setIdPessoa(Contas.getIdPessoa());
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> deleteConta(@PathVariable Long id){
        return repository.findById(id)
                .map(record ->{
                    repository.deleteById(id);
                    return ResponseEntity.ok().build()
                }).orElse(ResponseEntity.notFound().build());
    }

}
