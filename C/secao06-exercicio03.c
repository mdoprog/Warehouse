#include <stdio.h>

int main() {
	//Declaração
	int num, p, i;

	//Entrada
	printf ("Digite um número inteiro: ");
	fflush (stdout);
	scanf ("%d", &num);

	//Processamento
	if (num % 2 == 0) {
		p = num;
		printf ("%d é par", p);
	} else {
		i = num;
		printf ("%d é ímpar", i);
	}
}
