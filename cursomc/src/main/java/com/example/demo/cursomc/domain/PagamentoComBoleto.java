package com.example.demo.cursomc.domain;

import java.util.Date;

import com.example.demo.cursomc.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento{

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estadoPagamento, Pagamento pagamento, Date dataVencimento, Date dataPagamento) {
		super(id, estadoPagamento, pagamento);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}
	
	
	
}
