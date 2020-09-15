package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Declaração
		char sexo;
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o sexo [M/F]: ");
		sexo = teclado.next().charAt(0);
		System.out.println("Digite a altura: ");
		altura = teclado.nextFloat();
		
		//Processamento
		if (sexo == 'm' || sexo == 'M') {
			peso_ideal = (float)(72.7 * altura) - 58;
			//Saída
			System.out.printf("Peso ideal: %.2f", peso_ideal);
		}
		if (sexo == 'f' || sexo == 'F') {
			peso_ideal = (float)(62.1 * altura) - (float) 44.7;
			//Saída
			System.out.printf("Peso ideal: %.2f", peso_ideal);
		}
		if (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
			//Saída
			System.out.println("Sexo não reconhecido.");
		}
		
		teclado.close();
	}
}