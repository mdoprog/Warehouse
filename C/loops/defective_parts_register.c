#include <stdio.h>

int main(){
	//Declaração
	int quantidade = 0, defeito, def1 = 0, def2 = 0, def3 = 0, def4 = 0, id;

	//Entrada
	printf ("Digite o código do equipamento: ");
	fflush (stdout);
	scanf ("%d", &id);

	while (id != 0) {
		printf ("Qual o tipo de defeito?\n");
		printf ("1 - necessita de esfera\n");
		printf ("2 - necessita de limpeza\n");
		printf ("3 - necessita troca do cabo ou conector\n");
		printf ("4 - quebrado ou inutilizado\n");
		printf ("Selecione uma ou mais opções de acordo com o defeito: ");
		fflush (stdout);
		scanf ("%d", &defeito);
		//Processamento
		if (defeito == 1) {
			def1 = def1 + 1;
		}
		if (defeito == 2) {
			def2 = def2 + 1;
		}
		if (defeito == 3) {
			def3 = def3 + 1;
		}
		if (defeito == 4) {
			def4 = def4 + 1;
		}
		quantidade = quantidade + 1;
		printf ("Digite o código do equipamento: ");
		fflush (stdout);
		scanf ("%d", &id);
	}

	float p1, p2, p3, p4; //(float) cast
	p1 = ((float)def1 / (float)quantidade * 100);
	p2 = ((float)def2 / (float)quantidade * 100);
	p3 = ((float)def3 / (float)quantidade * 100);
	p4 = ((float)def4 / (float)quantidade * 100);

	//Saída
	printf ("\nQuantidade de mouses: %d\n\n", quantidade);
	printf ("Situação\t\t\t\tQuantidade\tPercentual\n");
	printf ("1 - necessita de esfera:\t\t\t%d\t%.1f%%\n", def1, p1);
	printf ("2 - necessita de limpeza:\t\t\t%d\t%.1f%%\n", def2, p2);
	printf ("3 - necessita troca do cabo ou conector:\t%d\t%.1f%%\n", def3, p3);
	printf ("4 - quebrado ou inutilizado:\t\t\t%d\t%.1f%%", def4, p4);
}
