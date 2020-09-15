package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//Declaração
		int quantidade = 0, id_equip, defeito, def1 = 0, def2 = 0, def3 = 0, def4 = 0;
		float p1, p2, p3, p4;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o código do equipamento: ");
		id_equip = entrada.nextInt();
		
		while (id_equip != 0) {
			System.out.println("Qual o defeito? ");
			System.out.println("1 - Necessita de esfera");
			System.out.println("2 - Necessita de limpeza");
			System.out.println("3 - Necessita troca do cabo ou conector");
			System.out.println("4 - Quebrado ou inutilizado");
			System.out.println("Selecione uma ou mais opções de acordo com o defeito: ");
			defeito = entrada.nextInt();
			if (defeito == 1) {
				def1 = def1 + 1;
			}
			if (defeito == 2) {
				def2 = def2 + 1;
			}
			if (defeito == 3) {
				def3 = def3 + 1;
			}
			if (defeito == 4) {
				def4 = def4 + 1;
			}
			quantidade = quantidade + 1;
			System.out.println("Digite o código do equipamento: ");
			id_equip = entrada.nextInt();
		}
		
		//float p1, p2, p3, p4;
		p1 = (float)def1 / (float)quantidade * 100;
		p2 = (float)def2 / (float)quantidade * 100;
		p3 = (float)def3 / (float)quantidade * 100;
		p4 = (float)def4 / (float)quantidade * 100;
		
		System.out.printf("Quantidade de mouses: %d\n\n", quantidade);
		System.out.printf("Situação\t\t\t\tQuantidade\tPercentual\n");
		System.out.printf("Necessita de esfera\t\t\t%d\t\t%.0f%%\n", def1, p1);
		System.out.printf("Necssita de limpeza\t\t\t%d\t\t%.0f%%\n", def2, p2);
		System.out.printf("Necessita troca do cabo ou conector\t%d\t\t%.0f%%\n", def3, p3);
		System.out.printf("Quebrado ou inutilizado\t\t\t%d\t\t%.0f%%\n", def4, p4);
		entrada.close();
	}

}
