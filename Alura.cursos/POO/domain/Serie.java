package domain;

public class Serie extends Titulo{
	
	
	int temporadas;
	int episodiosPorTemporadas;
	boolean ativa;
	int minutosPorEpisodios;
	
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getEpisodiosPorTemporadas() {
		return episodiosPorTemporadas;
	}
	public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
		this.episodiosPorTemporadas = episodiosPorTemporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getMinutosPorEpisodios() {
		return minutosPorEpisodios;
	}
	public void setMinutosPorEpisodios(int minutosPorEpisodios) {
		this.minutosPorEpisodios = minutosPorEpisodios;
	}
	
	
}
