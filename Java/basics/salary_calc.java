package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		//Declara��o
		float salario_hora, salario;
		int horas_trab;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Sal�rio/hora: ");
		salario_hora = teclado.nextFloat();
		System.out.print("Horas trabalhadas: ");
		horas_trab = teclado.nextInt();
		
		//Processamento
		salario = salario_hora * horas_trab;
		
		//Sa�da
		System.out.println("\nSal�rio Total: " + salario);
		
		teclado.close();
	
	}
}
