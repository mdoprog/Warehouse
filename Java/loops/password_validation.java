package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Declaração
		String usuario, senha;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
			System.out.println("Digite o nome do usuário: ");
			usuario = entrada.next();
			System.out.println("Digite a senha: ");
			senha = entrada.next();
			//Processamento
			while (senha.equals(usuario)) {
				System.out.println("Senha incorreta! A senha deve ser diferente do nome de usuário.");
				System.out.println("Digite o nome do usuário: ");
				usuario = entrada.next();
				System.out.println("Digite a senha: ");
				senha = entrada.next();
			}
		//Saída
		System.out.println("Login efetuado com sucesso!");
		entrada.close();
	}
}