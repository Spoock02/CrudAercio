package com.aercio.springtestecrud.Repository;

import com.aercio.springtestecrud.Controller.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long> {
}
