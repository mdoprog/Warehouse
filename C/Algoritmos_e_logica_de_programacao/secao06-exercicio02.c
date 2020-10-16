#include <stdio.h>

int main() {
	//Declaração
	int num, a, b;

	//Entrada
	printf ("Digite um número inteiro: ");
	fflush (stdout);
	scanf  ("%d", &num);

	//Processamento
	if (num >= 0) {
		a = num;
		printf ("Número positivo: %d", a);
	} else {
		b = num;
		printf ("Número negativo: %d", b);
	}
}
