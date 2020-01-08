package com.aercio.springtestecrud.Repository;

import com.aercio.springtestecrud.Controller.Contas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<Contas,Long> {
}
