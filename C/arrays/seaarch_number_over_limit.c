#include <stdio.h>

int main() {
	//Declaração
	int vetor[10];
	char maior50 = 0;

	//Entrada
	for (int i = 0; i < 10; i++) {
		printf ("Informe o número %d/10 para o vetor: ", (i + 1));
		fflush (stdout);
		scanf ("%d", &vetor[i]);
	}

	//Processamento
	for (int i = 0; i < 10; i++) {
		if (vetor[i] > 50) {
			printf ("O número %d está na posição %d\n", vetor[i], (i+1));
			maior50 = 1;
		}
	}

	if (maior50 < 1) {
		printf ("Nenhum número acima de 50 foi digitado.");
	}
}
