package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//Declaração
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a altura: ");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (float)(altura * 72.7) - 58;
		
		//Saída
		System.out.printf("Peso ideal: %.2f" , peso_ideal);
		
		teclado.close();

	}

}
