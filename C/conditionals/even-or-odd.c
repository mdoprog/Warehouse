#include <stdio.h>

int main() {
	//Declara��o
	int num, p, i;

	//Entrada
	printf ("Digite um n�mero inteiro: ");
	fflush (stdout);
	scanf ("%d", &num);

	//Processamento
	if (num % 2 == 0) {
		p = num;
		printf ("%d � par", p);
	} else {
		i = num;
		printf ("%d � �mpar", i);
	}
}
