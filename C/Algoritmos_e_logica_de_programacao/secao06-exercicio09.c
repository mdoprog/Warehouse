#include <stdio.h>

int main() {

	//Declaração
	float indice;

	//Entrada
	printf ("Informe o índice de poluição: ");
	fflush (stdout);
	scanf ("%f", &indice);

	//Processamento
	if (indice < 0.3) {
		printf ("Índice de poluição aceitável.");
	} else if (indice >= 0.3 && indice < 0.4) {
		printf ("Atenção: Indústrias do Grupo 1 devem suspender as atividades.");
	} else if (indice >= 0.4 && indice < 0.5) {
		printf ("Atenção: Indústrias dos Grupos 1 e Grupo 2 devem suspender as atividades.");
	} else {
		printf ("Atenção: Todos os Grupos devem suspender as atividades.");
	}
}
