#include <stdio.h>

int main() {

	//Declaração
	int num, maior = -999, menor = 999,soma = 0;
	float media = 0;

	//Entrada
	for (int i = 0; i < 10; i++) {
		printf ("Digite um número: ");
		fflush (stdout);
		scanf ("%d", &num);
		//Processamento
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
	media = soma / 10;

	//Saída
	printf ("\nMaior valor: %d", maior);
	printf ("\nMenor valor: %d", menor);
	printf ("\nMédia: %.1f", media);
}
