#include <stdio.h>

int main(){
	//Declarando vari�veis
	int quantidade_minima, quantidade_maxima, estoque_medio;

	//Entradas
	printf ("Informe a quantidade m�nima: ");
	fflush(stdout);
	scanf ("%d", &quantidade_minima);

	printf ("Informe a quantidade m�xima: ");
	fflush(stdout);
	scanf ("%d", &quantidade_maxima);

	//Processamento
	estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

	//Sa�da
	printf ("O estoque m�dio �: %d", estoque_medio);
}
