package com.example.demo.cursomc.domain.enums;

public enum TipoCliente {

	PESSOA_FISICA (1, "Pessoa Fisica"),
	PESSOA_JURIDICA(2, "Pessoa Juridica");
	
	private Integer cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null)
			return null;
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido! "+ cod);
}
}