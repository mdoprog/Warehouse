package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Declara��o
		int num, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um n�mero: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num >= 0) {
			a = num;
			//Sa�da
			System.out.println("Valor positivo: " + a);
		} else {
			b = num;
			//Sa�da
			System.out.println("Valor negativo: " + b);
		}
		
		teclado.close();
	}

}
