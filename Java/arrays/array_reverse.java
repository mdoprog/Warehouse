package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Declaração
		int vetor[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		System.out.println("Entre com 10 números: ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		//Saída
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		entrada.close();
	}
}
