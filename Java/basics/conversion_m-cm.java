package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Declara��o
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite o valor em metros: ");
		metros = teclado.nextInt();
		
		//Processamento
		centimetros = metros * 100;
		
		//Sa�da
		System.out.print(centimetros + "cm");
		
		teclado.close();
	}
}
