package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Declaração
		int vetor[] = new int[10];
		boolean maior50 = false;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um número para a posição: %d/10\n", (i+1));
			vetor[i] = entrada.nextInt();
		}
		
		//Saída
		for (int i = 0; (i < 10); i++) {
			if (vetor[i] > 50) {
				System.out.printf("O número %d está na posição %d\n", vetor[i], i);
				maior50 = true;
			}
		}
		
		if (!maior50) {
			System.out.println("Nenhum número acima de 50 foi digitado.");
		}
		entrada.close();

	}
}