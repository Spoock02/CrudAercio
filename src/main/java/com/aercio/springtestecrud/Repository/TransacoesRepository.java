package com.aercio.springtestecrud.Repository;

import com.aercio.springtestecrud.Controller.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {
}
