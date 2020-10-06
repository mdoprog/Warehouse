#include <stdio.h>
#include <ctype.h>

int main() {
	//Declaração
	float altura, peso_ideal;
	char sexo;

	//Entrada
	printf ("Digite a altura: ");
	fflush (stdout);
	scanf ("%f", &altura);
	printf ("Sexo [M] ou [m] para masculino: ");
	fflush (stdout);
	scanf ("%c", &sexo);
	printf ("\nSexo [F] ou [f] para feminino: ");
	fflush (stdout);
	scanf ("%c", &sexo);
	//gets (stdin); Usado na correção do professor porém, mostrou-se desnecessário para o correto funcionamento do programa

	//Processamento
	if (tolower(sexo) == 'm') {
		peso_ideal = 72.7 * altura - 58;
		printf ("Peso ideal: %.2f", peso_ideal);
	}
	if (tolower(sexo) == 'f') {
		peso_ideal = 62.1 * altura - 44.7;
		printf ("Peso ideal: %.2f", peso_ideal);
	}
	if (tolower(sexo) != 'm' && tolower(sexo) != 'f') {
		printf ("Sexo não reconhecido");
	}
}
