#include <stdio.h>

int main(){
	//Declaração
	int num, result;

	//Entrada
	printf ("Informe um número entre 1 e 10: ");
	fflush (stdout);
	scanf ("%d", &num);

	//Processamento
	while (num < 1 || num > 10) {
		printf ("Informe um número entre 1 e 10: ");
		fflush (stdout);
		scanf ("%d", &num);
	}
	for (int i = 0; i <= 10; i++) {
		result = num * i;
		//Saída
		printf ("\n%d X %d = %d", num, i, result);
	}

}
