package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Declara��o
		int num = 1, maior = -999999, menor = 999999, soma = 0;
		float media = 0; 
		Scanner entrada = new Scanner (System.in);
		 
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite um n�mero: ");
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
			System.out.println("Maior n�mero: " + maior);
			System.out.println("Menor n�mero: " + menor);
			System.out.println("M�dia: " + media);
			entrada.close();
		}
}