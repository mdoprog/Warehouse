#include <stdio.h>
//std = Standard (Padr�o)
//io = input/output (Entrada/Sa�da)

int main(){
	//Declara��o de vari�veis
	int num1, num2, soma, multiplicacao;

	//Entrada
	printf("Informe o primeiro n�mero: ");
	fflush(stdout);
	scanf("%d", &num1);

	printf("Informe o segundo n�mero: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	soma = num1 + num2;
	multiplicacao = soma * num1;

	//Sa�da
	printf("\nO resultado da multiplica��o �: ", multiplicacao);
}
