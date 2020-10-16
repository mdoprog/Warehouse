#include <stdio.h>

int main() {
	//Declaração de variáveis
	float valor_hora, salario;
	int horas_trabalhadas;

	//Entrada
	printf ("Quanto você ganha por hora? ");
	fflush (stdout);
	scanf ("%f", &valor_hora);

	printf ("Horas trabalhadas no mês: ");
	fflush (stdout);
	scanf ("%d", &horas_trabalhadas);

	//Processamento
	salario = valor_hora * horas_trabalhadas;

	//Saída
	printf  ("Salário mensal à receber: R$ %.2f", salario);
}
