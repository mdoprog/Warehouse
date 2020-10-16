#include <stdio.h>

int main() {
	//Declaração
	int vetor[10];

	//Entrada
	for (int i = 0; i < 10; i++) {
		printf ("Digite dez números: ");
		fflush (stdout);
		scanf ("%d", &vetor[i]);
	}

	//Processamento
	for (int i = 9; i >= 0; i--) {
		//Saída
		printf ("%d ", vetor[i]);
	}
}
