package runTime.teste;

public class RuntimeException031 {
	public static void main(String[] args) {
		extracted();
	}

	private static void extracted() {
		try {
			System.out.println("Abrindo arquivo");
			throw new RuntimeException();
//			System.out.println("Escrevendo dados no arquivo");
		}catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("Fechando recurso liberado pelo SO");
		}
	}
}
