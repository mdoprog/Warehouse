#include <stdio.h>

int main() {
	//Declarando vari�veis
	float altura, peso_ideal;

	//Entrada
	printf ("Digite sua altura: ");
	fflush (stdout);
	scanf ("%f", &altura);

	//Processamento
	peso_ideal = altura * 72.7 - 58;

	//Sa�da
	printf ("Seu peso ideal �: %.2fkg", peso_ideal);
}
