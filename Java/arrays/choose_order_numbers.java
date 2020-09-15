package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Declaração
		float vetor[] = new float[5];
		int codigo = 1;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		while (codigo != 0 && codigo <= 2) {
			System.out.println("\n\nDigite a opção: \n1 - Ordem direta \n2 - Ordem inversa \n0 - Terminar o programa");
			codigo = entrada.nextInt();
			if (codigo == 1) {
				for (int i = 0; i < 5; i++) {
					System.out.println("Digite um número real: ");
					vetor[i] = entrada.nextFloat();
				}
				//Saída
				for (int i = 0; i < 5; i++) {
					System.out.print(vetor[i] + " ");
				}
			}
			if (codigo == 2) {
				for (int i = 0; i < 5; i++) {
					System.out.println("Digite um número real: ");
					vetor[i] = entrada.nextFloat();
				}
				//Saída
				for (int i = 4; i >= 0; i--) {
					System.out.print(vetor[i] + " ");
				}
			}
		}
		System.out.println("Programa finalizado com sucesso.");
		entrada.close();
	}
}