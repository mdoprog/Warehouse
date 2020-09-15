package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Declaração
		int num = 1, maior = -999999, menor = 999999, soma = 0;
		float media = 0; 
		Scanner entrada = new Scanner (System.in);
		 
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite um número: ");
				num = entrada.nextInt();
				if (num >= 0) {
					if (num > maior) {
						maior = num;
					}
					if (num < menor) {
						menor = num;
					}
					soma = soma + num;
				} else {
					i--;
				}
			}
			media = (float)soma / 10;
			System.out.println("Maior número: " + maior);
			System.out.println("Menor número: " + menor);
			System.out.println("Média: " + media);
			entrada.close();
		}
}