package com.aercio.springtestecrud.repository;

import com.aercio.springtestecrud.model.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long> {
}
