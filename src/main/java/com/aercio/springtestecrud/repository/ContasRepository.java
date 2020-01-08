package com.aercio.springtestecrud.repository;

import com.aercio.springtestecrud.model.Contas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<Contas,Long> {
}
