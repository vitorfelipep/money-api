package com.prj.money.api.repository.projection;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.prj.money.api.model.enumeration.TipoLancamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
@AllArgsConstructor
public class ResumoLancamento implements Serializable{
	
	private static final long serialVersionUID = -4938855209937051223L;

	private Long codigo;
	private String descricao;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private BigDecimal valor;
	private TipoLancamento tipo;
	private String categoria;
	private String pessoa;
	
	
}
