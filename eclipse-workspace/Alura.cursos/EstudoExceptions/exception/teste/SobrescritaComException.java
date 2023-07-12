package exception.teste;

import exception.domain.Funcionario;
import exception.domain.Pessoa;

public class SobrescritaComException {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		
		funcionario.salvar();
		
	}
}
