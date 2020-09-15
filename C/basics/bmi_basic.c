#include <stdio.h>

int main() {
	//Declarando variáveis
	float altura, peso_ideal;

	//Entrada
	printf ("Digite sua altura: ");
	fflush (stdout);
	scanf ("%f", &altura);

	//Processamento
	peso_ideal = altura * 72.7 - 58;

	//Saída
	printf ("Seu peso ideal é: %.2fkg", peso_ideal);
}
