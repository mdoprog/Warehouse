#include <stdio.h>

int main(){

	//Declaração
	int vetor[5], pares[5], cont_p = 0;

	//Entrada
	for (int i = 0; i < 5; i++) {
		printf ("Digite um valor: ");
		fflush (stdout);
		scanf ("%d", &vetor[i]);
		if (vetor[i] > 0) {
			if (vetor[i] % 2 == 0) {
				pares[cont_p] = vetor[i];
				cont_p++;
			}
		}
	}



	if (cont_p > 0) {
		printf ("Pares: ");
		for (int i = 0; i < cont_p; i++) {
			printf ("%d ", pares[i]);
		}
	} else {
		printf ("Nenhum número par localizado no vetor");
	}
}
