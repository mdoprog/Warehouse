package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Declaração
		int num;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe um número inteiro: ");
		num = teclado.nextInt();
		
		if (num % 2 == 0) {
			if (num >= 0) {
				System.out.printf("O número %d é par e positivo\n", num);
			} else {
				System.out.printf("O número %d é par e negativo\n", num);
			}
		} else {
			if (num >= 0) {
				System.out.printf("O número %d é ímpar e positivo\n", num);
			} else {
				System.out.printf("o número %d é ímpar e negativo\n", num);
			}
		}
		teclado.close();
	}
}
