#include <stdio.h>

int main() {
	//Declaração
	int vetor1[5], vetor2[5], soma[5];

	//Entrada
	for (int i = 0; i < 5; i++) {
		printf ("Digite um valor para o vetor 1: ");
		fflush (stdout);
		scanf ("%d", &vetor1[i]);
		soma[i] = vetor1[i];
	}
	for (int i = 0; i < 5; i++) {
		printf ("Digite um valor para o vetor 2: ");
		fflush (stdout);
		scanf ("%d", &vetor2[i]);
		//Processamento
		soma[i] = vetor1[i] + vetor2[i];
	}

	//Saída
	for (int i = 0; i < 5; i++) {
		printf ("%d ", soma[i]);
	}
}
