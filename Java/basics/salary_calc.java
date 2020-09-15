package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		//Declaração
		float salario_hora, salario;
		int horas_trab;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Salário/hora: ");
		salario_hora = teclado.nextFloat();
		System.out.print("Horas trabalhadas: ");
		horas_trab = teclado.nextInt();
		
		//Processamento
		salario = salario_hora * horas_trab;
		
		//Saída
		System.out.println("\nSalário Total: " + salario);
		
		teclado.close();
	
	}
}
