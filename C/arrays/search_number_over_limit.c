#include <stdio.h>

int main() {
	//Declara��o
	int vetor[10];
	char maior50 = 0;

	//Entrada
	for (int i = 0; i < 10; i++) {
		printf ("Informe o n�mero %d/10 para o vetor: ", (i + 1));
		fflush (stdout);
		scanf ("%d", &vetor[i]);
	}

	//Processamento
	for (int i = 0; i < 10; i++) {
		if (vetor[i] > 50) {
			printf ("O n�mero %d est� na posi��o %d\n", vetor[i], (i+1));
			maior50 = 1;
		}
	}

	if (maior50 < 1) {
		printf ("Nenhum n�mero acima de 50 foi digitado.");
	}
}
