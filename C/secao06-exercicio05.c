#include <stdio.h>

int main() {
	//Declaração
	int p, e;
	float m;

	//Entrada
	printf ("Digite o peso: ");
	fflush (stdout);
	scanf ("%d", &p);

	//Processamento
	if (p > 50) {
		e = p - 50;
		printf ("Excesso: %dkg", e);
		m = e * 4;
		printf ("\nMulta: R$%.2f", m);
	} else {
		e = 0;
		printf ("Excesso: %dkg", e);
		m = 0;
		printf ("\nMulta: R$%.2f", m);
	}
}
