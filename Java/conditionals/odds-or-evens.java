package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Declara��o
		int num, p, i;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um n�mero: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num % 2 == 0) {
			p = num;
			//Sa�da
			System.out.print(p + " - N�mero par");
		} else {
			i = num;
			//Sa�da
			System.out.print(i + " - N�mero �mpar");
		}
		
		teclado.close();
	}

}

