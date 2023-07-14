package com.example.demo.cursomc.domain;

import com.example.demo.cursomc.domain.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento{

	private Integer numerosParcelas;

	
	public PagamentoComCartao() {
		super();
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pagamento pagamento, Integer numerosParInteger) {
		super(id, estadoPagamento, pagamento);
		this.numerosParcelas = numerosParcelas;
	}
	
	
}
