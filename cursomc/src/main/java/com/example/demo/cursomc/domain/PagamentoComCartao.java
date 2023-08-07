
package com.example.demo.cursomc.domain;

import javax.persistence.Entity;

import com.example.demo.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{

	private static final long serialVersionUID = 1L;
	private Integer numerosParcelas;

	
	public PagamentoComCartao() {
		super();
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numerosParcelas) {
		super(id, estadoPagamento, pedido);
		this.numerosParcelas = numerosParcelas;
	}

	public Integer getNumerosParcelas() {
		return numerosParcelas;
	}

	public void setNumerosParcelas(Integer numerosParcelas) {
		this.numerosParcelas = numerosParcelas;
	}
	
	
}
