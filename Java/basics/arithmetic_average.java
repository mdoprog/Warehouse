package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Declara��o
		int quant_min, quant_max;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe a quantidade m�nima: ");
		quant_min = teclado.nextInt();
		System.out.print("Informe a quantidade m�xima: ");
		quant_max = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quant_min + quant_max) / 2;
		
		//Sa�da
		System.out.print("Estoque m�dio: "+ estoque_medio);
		
		teclado.close();
	}
}