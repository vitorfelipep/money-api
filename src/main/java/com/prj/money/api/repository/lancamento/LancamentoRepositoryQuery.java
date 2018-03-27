package com.prj.money.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prj.money.api.model.Lancamento;
import com.prj.money.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageAble);
}
