#include <stdio.h>
int main() {
	//Declara��o
	int num;

	//Entrada
	printf ("Digite um n�mero inteiro: ");
	fflush (stdout);
	scanf ("%d", &num);

	//Processamento
	if (num % 2 == 0) {
		if (num >= 0) {
			//Sa�da
			printf ("N�mero par positivo");
		} else {
			printf ("N�mero par negativo");
		}
	} else {
		if (num >= 0) {
			//Sa�da
			printf ("N�mero �mpar positivo");
		} else {
			printf ("N�mero �mpar negativo");
		}
	}
}
