package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Declara��o
		int num, maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		do {
			
			System.out.println("Digite um n�mero inteiro ou 0 (zero) para sair: ");
			num = entrada.nextInt();
			//Processamento
			if (num > maior) {
				maior = num;
			}
		} while (num != 0);
		//Sa�da
		System.out.println("Maior: " + maior);
		entrada.close();
	}
}
