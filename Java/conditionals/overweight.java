package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Declaração
		float e, m, p;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o peso: ");
		p = teclado.nextFloat();
		
		//Processamento
		if (p > 50) {
			e = p - 50;
			m = (float)e * (float)4;
			//Saída
			System.out.println("Excesso: " + e + "kg");
			System.out.printf("Valor da multa: R$%.2f", m);
		} else {
			e = 0;
			m = 0;
			//Saída
			System.out.println("Excesso: " + e + "kg");
			System.out.printf("Valor da multa: %.2f", m);
		}

		teclado.close();
	}

}
