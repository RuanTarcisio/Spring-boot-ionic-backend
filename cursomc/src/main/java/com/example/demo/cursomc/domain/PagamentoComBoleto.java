package com.example.demo.cursomc.domain;

import java.util.Date;

import com.example.demo.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class PagamentoComBoleto extends Pagamento{

	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estadoPagamento, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
