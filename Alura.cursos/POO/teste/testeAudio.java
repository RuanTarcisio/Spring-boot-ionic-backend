package teste;

import java.util.Iterator;

import domain.MinhasPreferidas;
import domain.Musica;
import domain.Podcast;

public class testeAudio {
	public static void main(String[] args) {
		Musica music = new Musica();
		music.setArtista("Forever");
		music.setAlbum("Kiss");
		
		for(int i = 0; i < 1000; i++) {
			music.reproduz();
		}
		
		for(int i = 0; i < 50; i++) {
			music.curte();
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setapresentador("Doidao Aprendendo");
		
		for(int i = 0; i < 1000; i++) {
			meuPodcast.curte();
		}
		
		for(int i = 0; i < 2000; i++) {
			meuPodcast.reproduz();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(music);
		
	}
}
