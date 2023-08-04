package com.example.demo.cursomc.domain;

import java.util.Date;

import com.example.demo.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.persistence.Entity;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento{

	private static final long serialVersionUID = 1L;
//	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataVencimento;
	
//	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
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
