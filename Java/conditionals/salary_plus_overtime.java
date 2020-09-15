package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Declara��o
		@SuppressWarnings("unused")
		int c;
		float n, e = 0, salario, valor_hora = 10;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("C�digo do funcion�rio: ");
		c = teclado.nextInt();
		System.out.println("Horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//Processamento
		if (n > 50) {
			e = (n - 50) * 20;
			salario = 50 * valor_hora + e;
		} else {
			salario = n * valor_hora;
		}
		
		//Sa�da
		System.out.printf("Sal�rio total: R$%.2f\n", salario);
		System.out.printf("Sal�rio extra: R$%.2f\n", e);
		teclado.close();
	}
}