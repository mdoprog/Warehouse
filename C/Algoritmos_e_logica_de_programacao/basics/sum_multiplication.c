#include <stdio.h>
//std = Standard (Padrão)
//io = input/output (Entrada/Saída)

int main(){
	//Declaração de variáveis
	int num1, num2, soma, multiplicacao;

	//Entrada
	printf("Informe o primeiro número: ");
	fflush(stdout);
	scanf("%d", &num1);

	printf("Informe o segundo número: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	soma = num1 + num2;
	multiplicacao = soma * num1;

	//Saída
	printf("\nO resultado da multiplicação é: ", multiplicacao);
}
