package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Declaração
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		
		//Saída
		System.out.print("Soma: " + soma);
		
		teclado.close();

	}

}
