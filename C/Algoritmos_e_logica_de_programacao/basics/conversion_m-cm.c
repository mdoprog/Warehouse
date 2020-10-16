#include <stdio.h>

int main() {
	//Declarando variáveis
	int metros, centimetros;

	//Entrada
	printf ("Digite a medida em metros: ");
	fflush (stdout);
	scanf ("%d", &metros);

	//Processamento
	centimetros = metros * 100;

	//Saida
	printf ("%d metro(s) equivale a %d centímetros", metros, centimetros);
}
