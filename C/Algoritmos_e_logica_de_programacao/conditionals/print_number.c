#include <stdio.h>

int main() {
	//Declaração
	int num;

	printf ("Digite um número inteiro: ");
	fflush (stdout);
	scanf ("%d", &num);

	if (num > 100) {
		printf ("%d", num);
	} else {
		num = 0;
		printf ("%d", num);
	}
}
