package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Declaração
		int num, result;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um número entre 1 e 10 para ver a tabuada: ");
		num = entrada.nextInt();
		while (num < 1 || num > 10) {
			System.out.println("Digite um número entre 1 e 10 para ver a tabuada: ");
			num = entrada.nextInt();
		}
		System.out.printf("Tabuada de %d:\n", num);
		
		//Processamento
		for (int i = 0; i <= 10; i++) {
			result = num * i;
			System.out.printf("%d X %d = %d\n", num, i, result);
		}
		entrada.close();
	}
}