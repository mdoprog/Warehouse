package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//Declara��o
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe o �ndice de polui��o: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if (indice >= 0.5) {
			//Sa�da
			System.out.println("Todos os grupos devem suspender as atividades!");
		} else if (indice >= 0.4) {
			//Sa�da
			System.out.println("Grupo 1 e Grupo 2 - Suspender atividades.");
		} else if (indice >= 0.3) {
			//Sa�da
			System.out.println("Grupo 1 - Suspender as atividades.");
		} else {
			//Sa�da
			System.out.println("Aceit�vel.");
		}
		teclado.close();
	}
}
