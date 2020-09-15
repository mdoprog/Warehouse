package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Declaração
		int vetor1[] = new int [10];
		int vetor2[] = new int [10];
		int soma[] = new int [10];
		Scanner entrada = new Scanner (System.in);
		
		//Entrada
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor para o vetor 1: ");
			vetor1[i] = entrada.nextInt();
			System.out.println("Digite um valor para o vetor 2: ");
			vetor2[i] = entrada.nextInt();
			//Processamento
			soma[i] = vetor1[i] + vetor2[i];
		}
		
		//Saída
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", soma[i]);
		}
		entrada.close();
	}
}