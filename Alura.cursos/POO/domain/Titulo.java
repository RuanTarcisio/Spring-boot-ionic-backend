package domain;

public class Titulo {

	String nome;
	int anoLancamento;
	boolean incluiNoPlano;
	double avaliacao;
	int totalAvaliacoes;
	int duracaoEmMinutos;
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public boolean isIncluiNoPlano() {
		return incluiNoPlano;
	}
	
	public void setIncluiNoPlano(boolean incluiNoPlano) {
		this.incluiNoPlano = incluiNoPlano;
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public int getTotalAvaliacoes() {
		return totalAvaliacoes;
	}
	
	public void setTotalAvaliacoes(int totalAvaliacoes) {
		this.totalAvaliacoes = totalAvaliacoes;
	}
	
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
		
	public void exibeFichaTecnica() {
		System.out.println(this.nome);
		System.out.println(this.duracaoEmMinutos);
	}
	public void avalia() {
		
	}
	
}
