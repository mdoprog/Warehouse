#include <stdio.h>

int main(){

	//Declara��o
	int num, maior = 0;

	//Entrada
	do {
		printf ("Digite um n�mero inteiro qualquer ou 0 (zero) para sair: ");
		fflush (stdout);
		scanf ("%d", &num);

		//Processamento
		if (num > maior) {
			maior = num;
		}
	} while (num != 0);

	//Sa�da
	printf ("Maior n�mero digitado: %d", maior);
}
