package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Declara��o
		int num;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe um n�mero inteiro: ");
		num = teclado.nextInt();
		
		if (num % 2 == 0) {
			if (num >= 0) {
				System.out.printf("O n�mero %d � par e positivo\n", num);
			} else {
				System.out.printf("O n�mero %d � par e negativo\n", num);
			}
		} else {
			if (num >= 0) {
				System.out.printf("O n�mero %d � �mpar e positivo\n", num);
			} else {
				System.out.printf("o n�mero %d � �mpar e negativo\n", num);
			}
		}
		teclado.close();
	}
}
