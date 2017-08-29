package com.prj.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.money.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
