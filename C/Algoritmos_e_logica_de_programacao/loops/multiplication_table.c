#include <stdio.h>

int main(){
	//Declara��o
	int num, result;

	//Entrada
	printf ("Informe um n�mero entre 1 e 10: ");
	fflush (stdout);
	scanf ("%d", &num);

	//Processamento
	while (num < 1 || num > 10) {
		printf ("Informe um n�mero entre 1 e 10: ");
		fflush (stdout);
		scanf ("%d", &num);
	}
	for (int i = 0; i <= 10; i++) {
		result = num * i;
		//Sa�da
		printf ("\n%d X %d = %d", num, i, result);
	}

}
