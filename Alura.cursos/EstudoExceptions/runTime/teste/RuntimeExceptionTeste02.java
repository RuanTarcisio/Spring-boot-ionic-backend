package runTime.teste;

import javax.management.RuntimeErrorException;

public class RuntimeExceptionTeste02 {
	public static void main(String[] args) {
		divisao(1, 0);
	}
/**
 * 
 * @param i
 * @param b nao pode ser zero
 * @return
 * @throws IllegalArgumentException caso b seja zero
 */
	private static int divisao(int i, int j) throws IllegalArgumentException{
		if(j == 0)
			throw new IllegalArgumentException("Argumento ilegal");
			
			return i/j;
		
	}
}
