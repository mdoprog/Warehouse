#include <stdio.h>

int main() {
	//Declara��o
	int num, a, b;

	//Entrada
	printf ("Digite um n�mero inteiro: ");
	fflush (stdout);
	scanf  ("%d", &num);

	//Processamento
	if (num >= 0) {
		a = num;
		printf ("N�mero positivo: %d", a);
	} else {
		b = num;
		printf ("N�mero negativo: %d", b);
	}
}
