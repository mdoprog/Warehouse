#include <stdio.h>

int main() {
	//Declarando vari�veis
	int metros, centimetros;

	//Entrada
	printf ("Digite a medida em metros: ");
	fflush (stdout);
	scanf ("%d", &metros);

	//Processamento
	centimetros = metros * 100;

	//Saida
	printf ("%d metro(s) equivale a %d cent�metros", metros, centimetros);
}
