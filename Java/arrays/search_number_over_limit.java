package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Declara��o
		int vetor[] = new int[10];
		boolean maior50 = false;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um n�mero para a posi��o: %d/10\n", (i+1));
			vetor[i] = entrada.nextInt();
		}
		
		//Sa�da
		for (int i = 0; (i < 10); i++) {
			if (vetor[i] > 50) {
				System.out.printf("O n�mero %d est� na posi��o %d\n", vetor[i], i);
				maior50 = true;
			}
		}
		
		if (!maior50) {
			System.out.println("Nenhum n�mero acima de 50 foi digitado.");
		}
		entrada.close();

	}
}