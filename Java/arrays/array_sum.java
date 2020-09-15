package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Declaração
		int vetor[] = new int[20], soma = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite 20 números inteiros: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = entrada.nextInt();
			soma = soma + vetor[i];
		}
		
		//Saida
		System.out.println("Soma: " + soma);
		entrada.close();
	}
}
