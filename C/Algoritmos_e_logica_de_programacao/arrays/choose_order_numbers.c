#include <stdio.h>

int main() {
	//Declara��o
	int cod;
	float vetor[5];

	do {
		printf ("\nDigite o c�digo referente a op��o desejada: \n1 - Ordem Direta: \n2 - Ordem Inversa: \n0 - Encerrar\n");
		printf ("Op��o selecionada: ");
		fflush (stdout);
		scanf ("%d", &cod);

		//Entrada
		if (cod == 1) {
			printf ("Digite 5 n�meros reais:\n");
			fflush (stdout);
			for (int i = 0; i < 5; i++) {
				scanf ("\n%f", &vetor[i]);
			}
			//Sa�da
			printf ("Ordem direta: ");
			for (int i = 0; i < 5; i++) {
				printf ("%.1f ", vetor[i]);
			}
		}

		//Entrada
		if (cod == 2) {
			printf ("Digite 5 n�meros reais:\n");
			fflush (stdout);
			for (int i = 0; i < 5; i++) {
			scanf ("\n%f", &vetor[i]);
			}

			//Sa�da
			printf ("Ordem inversa: ");
			for (int i = 4; i >= 0; i--) {
				printf ("%.1f ", vetor[i]);
			}
		}
	} while (cod != 0);
	printf ("\nPrograma finalizado com sucesso.");
}
