#include <stdio.h>

int main() {
	//Declara��o de vari�veis
	float valor_hora, salario;
	int horas_trabalhadas;

	//Entrada
	printf ("Quanto voc� ganha por hora? ");
	fflush (stdout);
	scanf ("%f", &valor_hora);

	printf ("Horas trabalhadas no m�s: ");
	fflush (stdout);
	scanf ("%d", &horas_trabalhadas);

	//Processamento
	salario = valor_hora * horas_trabalhadas;

	//Sa�da
	printf  ("Sal�rio mensal � receber: R$ %.2f", salario);
}
