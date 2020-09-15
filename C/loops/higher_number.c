#include <stdio.h>

int main(){

	//Declaração
	int num, maior = 0;

	//Entrada
	do {
		printf ("Digite um número inteiro qualquer ou 0 (zero) para sair: ");
		fflush (stdout);
		scanf ("%d", &num);

		//Processamento
		if (num > maior) {
			maior = num;
		}
	} while (num != 0);

	//Saída
	printf ("Maior número digitado: %d", maior);
}
