#include <stdio.h>

int main() {

	//Declara��o
	float indice;

	//Entrada
	printf ("Informe o �ndice de polui��o: ");
	fflush (stdout);
	scanf ("%f", &indice);

	//Processamento
	if (indice < 0.3) {
		printf ("�ndice de polui��o aceit�vel.");
	} else if (indice >= 0.3 && indice < 0.4) {
		printf ("Aten��o: Ind�strias do Grupo 1 devem suspender as atividades.");
	} else if (indice >= 0.4 && indice < 0.5) {
		printf ("Aten��o: Ind�strias dos Grupos 1 e Grupo 2 devem suspender as atividades.");
	} else {
		printf ("Aten��o: Todos os Grupos devem suspender as atividades.");
	}
}
