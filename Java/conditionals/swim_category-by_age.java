package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//Declaração
		int idade;
		String categoria;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Entre com a idade do nadador: ");
		idade = teclado.nextInt();
		
		//Processamento
		if (idade >= 18) {
			categoria = "adulto";
		} else if (idade >= 14) {
			categoria = "juvenil-b";
		} else if (idade >= 12) {
			categoria = "juvenil-a";
		} else if (idade >= 8) {
			categoria = "infantil-b";
		} else {
			categoria = "infantil-a";
		}
		System.out.println("Categoria: " + categoria);
		teclado.close();
	}
}