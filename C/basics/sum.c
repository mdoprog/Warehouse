#include <stdio.h>

int main() {
	//Declarando vari�veis
	int num1, num2, soma;

	//Entradas
	printf ("Informe o primeiro n�mero: ");
	fflush (stdout);
	scanf ("%d", &num1);

	printf ("Informe o segundo n�mero: ");
	fflush (stdout);
	scanf ("%d", &num2);

	//Processamento
	soma = (num1 + num2);

	//Sa�da
	printf ("A soma � %d", soma);

}
