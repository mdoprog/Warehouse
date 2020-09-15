package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Declaração
		int quant_min, quant_max;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe a quantidade mínima: ");
		quant_min = teclado.nextInt();
		System.out.print("Informe a quantidade máxima: ");
		quant_max = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quant_min + quant_max) / 2;
		
		//Saída
		System.out.print("Estoque médio: "+ estoque_medio);
		
		teclado.close();
	}
}