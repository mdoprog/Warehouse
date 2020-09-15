package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Declaração
		int num, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um número: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num >= 0) {
			a = num;
			//Saída
			System.out.println("Valor positivo: " + a);
		} else {
			b = num;
			//Saída
			System.out.println("Valor negativo: " + b);
		}
		
		teclado.close();
	}

}
