package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Declaração
		int num, p, i;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um número: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num % 2 == 0) {
			p = num;
			//Saída
			System.out.print(p + " - Número par");
		} else {
			i = num;
			//Saída
			System.out.print(i + " - Número ímpar");
		}
		
		teclado.close();
	}

}

