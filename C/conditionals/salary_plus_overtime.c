#include <stdio.h>

int main() {
	//Declara��o
	int c, n;
	float salario, extra = 0, valor_hora = 10;

	//Entrada
	printf ("Digite o c�digo do funcion�rio: ");
	fflush (stdout);
	scanf ("%d", &c);
	printf ("Digite o n�mero de horas trabalhadas: ");
	fflush (stdout);
	scanf ("%d", &n);

	//Processamento
	if (n > 50) {
		extra = (n - 50) * 20;
		salario = 50 * valor_hora + extra;
		//Sa�da
		printf ("Sal�rio: %.2f\n", salario);
		printf ("Sal�rio extra: %.2f", extra);
	} else {
		salario = n * valor_hora;
		//Sa�da
		printf ("Sal�rio: %.2f\n", salario);
		printf ("Sal�rio extra: %.2f", extra);
	}
}
