package com.example.demo.cursomc.domain;

import com.example.demo.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity 
public abstract class  Pagamento {

	private Integer id;
	private EstadoPagamento estadoPagamento;
	
	private Pagamento pagamento;

	
	public Pagamento() {
		super();
	}

	public Pagamento(Integer id, EstadoPagamento estadoPagamento, Pagamento pagamento) {
		super();
		this.id = id;
		this.estadoPagamento = estadoPagamento;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstadoPagamento() {
		return estadoPagamento;
	}

	public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
		this.estadoPagamento = estadoPagamento;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
}
