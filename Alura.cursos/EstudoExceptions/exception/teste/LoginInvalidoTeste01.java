package exception.teste;

import java.util.Scanner;

import exception.domain.LoginInvalidoException;

public class LoginInvalidoTeste01 {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void logar() throws LoginInvalidoException {

		Scanner leitor = new Scanner(System.in);
		String userNameDB = "RuanT";
		String passWordDB = "Teste";
		System.out.println("Digite o usuario: ");
		String userName = leitor.nextLine();
		System.out.println("Digite a senha: ");
		String passWord = leitor.nextLine();
		
		if(!userNameDB.equals(userName) || !passWordDB.equals(passWord)) {
			throw new LoginInvalidoException("Usuario o senha invalidos. ");
		}
	}
}
