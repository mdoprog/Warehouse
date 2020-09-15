#include <stdio.h>
int main() {
	//Declaração
	int num;

	//Entrada
	printf ("Digite um número inteiro: ");
	fflush (stdout);
	scanf ("%d", &num);

	//Processamento
	if (num % 2 == 0) {
		if (num >= 0) {
			//Saída
			printf ("Número par positivo");
		} else {
			printf ("Número par negativo");
		}
	} else {
		if (num >= 0) {
			//Saída
			printf ("Número ímpar positivo");
		} else {
			printf ("Número ímpar negativo");
		}
	}
}
