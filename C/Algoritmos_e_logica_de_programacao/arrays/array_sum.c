#include <stdio.h>

int main() {
	//Declara��o
	int vetor[20], soma = 0;

	//Entrada
	for (int i = 0; i < 20; i++) {
		printf ("Digite um n�mero para o vetor %d/20: ", (i + 1));
		fflush (stdout);
		scanf ("%d", &vetor[i]);
		//Processamento
		soma = soma + vetor[i];
	}

	//Sa�da
	printf ("Soma: %d", soma);
}
