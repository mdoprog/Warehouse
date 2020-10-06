#include <stdio.h>

int main() {
	//Declaração
	int c, n;
	float salario, extra = 0, valor_hora = 10;

	//Entrada
	printf ("Digite o código do funcionário: ");
	fflush (stdout);
	scanf ("%d", &c);
	printf ("Digite o número de horas trabalhadas: ");
	fflush (stdout);
	scanf ("%d", &n);

	//Processamento
	if (n > 50) {
		extra = (n - 50) * 20;
		salario = 50 * valor_hora + extra;
		//Saída
		printf ("Salário: %.2f\n", salario);
		printf ("Salário extra: %.2f", extra);
	} else {
		salario = n * valor_hora;
		//Saída
		printf ("Salário: %.2f\n", salario);
		printf ("Salário extra: %.2f", extra);
	}
}
