#include <stdio.h>

int main() {
	//Declara��o
	int vetor[10];

	//Entrada
	for (int i = 0; i < 10; i++) {
		printf ("Digite dez n�meros: ");
		fflush (stdout);
		scanf ("%d", &vetor[i]);
	}

	//Processamento
	for (int i = 9; i >= 0; i--) {
		//Sa�da
		printf ("%d ", vetor[i]);
	}
}
