#include <stdio.h>

int main() {
	//Declara��o
	int num;

	printf ("Digite um n�mero inteiro: ");
	fflush (stdout);
	scanf ("%d", &num);

	if (num > 100) {
		printf ("%d", num);
	} else {
		num = 0;
		printf ("%d", num);
	}
}
