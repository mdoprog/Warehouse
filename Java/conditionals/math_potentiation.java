package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//Declaração
		int n1, n2, n3, n4;
		float q1, q2, q3, q4;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Digite quatro números: ");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		n4 = teclado.nextInt();
		
		//Processamento
		q1 = (float)Math.pow(n1, 2);
		q2 = (float)Math.pow(n2, 2);
		q3 = (float)Math.pow(n3, 2);
		q4 = (float)Math.pow(n4, 2);
		
		if (q3 >= 1000) {
			System.out.printf("O quadrado do número %d é maior que mil: %.0f", n3, q3);
		} else {
			System.out.printf("%d ao quadrado: %.0f\n", n1, q1);
			System.out.printf("%d ao quadrado: %.0f\n", n2, q2);
			System.out.printf("%d ao quadrado: %.0f\n", n3, q3);
			System.out.printf("%d ao quadrado: %.0f\n", n4, q4);
		}
		teclado.close();
	}
}
