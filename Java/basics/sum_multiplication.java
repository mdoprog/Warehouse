package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Declara��o
		int num1, num2, soma, multiplicacao;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		//Sa�da
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
		
		teclado.close();
	}
}
