package domain;

public class Audio {
	String titulo ;
	int totalDeReproducoes;
	int totalCurtidas;
	int classificacao;
	
	
	public Audio() {
		this.totalCurtidas = 0;
		this.totalDeReproducoes = 0;
	}

	public void  curte() {
		this.totalCurtidas+=1;
	}
	
	public void reproduz() {
		this.totalDeReproducoes+=1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}

//	public void setTotalDeReproducoes(int totalDeReproducoes) {
//		this.totalDeReproducoes = totalDeReproducoes;
//	}

	public int getTotalCurtidas() {
		return totalCurtidas;
	}

//	public void setTotalCurtidas(int totalCurtidas) {
//		this.totalCurtidas = totalCurtidas;
//	}

	public int getClassificacao() {
		if(this.getTotalDeReproducoes() > 500) {
			return 10;
		}else return 7;
		
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	
	
}
