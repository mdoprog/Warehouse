package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Declara��o
		String usuario, senha;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
			System.out.println("Digite o nome do usu�rio: ");
			usuario = entrada.next();
			System.out.println("Digite a senha: ");
			senha = entrada.next();
			//Processamento
			while (senha.equals(usuario)) {
				System.out.println("Senha incorreta! A senha deve ser diferente do nome de usu�rio.");
				System.out.println("Digite o nome do usu�rio: ");
				usuario = entrada.next();
				System.out.println("Digite a senha: ");
				senha = entrada.next();
			}
		//Sa�da
		System.out.println("Login efetuado com sucesso!");
		entrada.close();
	}
}