package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Declara��o
		int num;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um n�mero: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num > 100) {
			System.out.print(num);
		} else {
			num = 0;
			System.out.print(num);
		}
		teclado.close();
	}
}
