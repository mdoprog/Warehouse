package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		//Declara��o
		int[] vetor = new int[5];
		int[] pares = new int[5];
		int cont = 0;
		Scanner entrada = new Scanner (System.in);
		
		//Entrada
		System.out.println("Digite cinco n�meros inteiros: ");
		for (int i = 0; i < 5; i++) {
			vetor[i] = entrada.nextInt();
			if (vetor[i] > 0) {
				if (vetor[i] % 2 == 0) {
					pares[cont] = vetor[i];
					cont = cont + 1;
				}
			}
		}
		
		//Sa�da
		System.out.print("\nN�meros pares: ");
		if (cont > 0) {
			for (int i = 0; i < cont; i++) {
				System.out.printf("%d ", pares[i]);
			}
		} else {
			System.out.println(0);
		}
		entrada.close();
	}
}