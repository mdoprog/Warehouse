#include <stdio.h>
#include <string.h>

int main() {

	//Declara��o
	int idade;
	char categoria[11];

	//Entrada
	printf ("Digite a idade do nadador: ");
	fflush (stdout);
	scanf ("%d", &idade);

	//Processamento

	if (idade >= 18) {
		strcpy(categoria, "adulto");
	} else if (idade >= 14) {
		strcpy(categoria, "juvenil-b");
	} else if (idade >= 12) {
		strcpy(categoria, "juvenil-a");
	} else if (idade >= 8) {
		strcpy(categoria, "infantil-b");
	} else {
		strcpy(categoria, "infantil-a");
	}

	//Sa�da
	printf ("Categoria: %s", categoria);

}
