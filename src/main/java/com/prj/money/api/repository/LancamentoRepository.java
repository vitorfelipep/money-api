package com.prj.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.money.api.model.Lancamento;
import com.prj.money.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
