package domain;

public class MinhasPreferidas {

	public void inclui(Audio audio) {
		if(audio.getClassificacao() >= 9) {
				System.out.println(audio.getTitulo()+ "Precious music");
		}else
			System.out.println("Listen Later");
	}
}
