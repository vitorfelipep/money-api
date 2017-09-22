package com.prj.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.money.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
