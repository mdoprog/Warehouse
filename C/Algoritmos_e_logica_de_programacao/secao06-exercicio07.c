#include <stdio.h>
#include <math.h>

int main() {
	//Declara��o
	float n1, n2, n3, n4, q1, q2, q3, q4;

	//Entrada
	printf ("Digite quatro n�meros: \n");
	fflush (stdout);
	scanf ("%f", &n1);
	scanf ("%f", &n2);
	scanf ("%f", &n3);
	scanf ("%f", &n4);

	//Processamento
	q1 = pow (n1, 2);
	q2 = pow (n2, 2);
	q3 = pow (n3, 2);
	q4 = pow (n4, 2);

	if (q3 >= 1000) {
		printf ("O quadrado do n�mero %.0f � maior que 1000: %.0f", n3, q3);
	}
	else {
		printf ("N�mero %.0f ao quadrado: %.0f\n", n1, q1);
		printf ("N�mero %.0f ao quadrado: %.0f\n", n2, q2);
		printf ("N�mero %.0f ao quadrado: %.0f\n", n3, q3);
		printf ("N�mero %.0f ao quadrado: %.0f\n", n4, q4);
	}
}
