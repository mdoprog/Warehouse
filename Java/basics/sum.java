package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Declara��o
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite o primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		
		//Sa�da
		System.out.print("Soma: " + soma);
		
		teclado.close();

	}

}
