#include <stdio.h>
#include <string.h>

int main(){

	char usuario[20], senha[20];

	do {
		printf ("\nDigite o nome de usuário: ");
		fflush (stdout);
		gets (usuario);
		printf ("Digite a senha: ");
		fflush (stdout);
		gets (senha);
		if (!strcmp(usuario, senha)) {
			printf ("\nSenha incorreta! A Senha deve ser diferente do nome de usuário.");
		}
	} while (!strcmp(usuario, senha));
	printf ("Login efetuado com sucesso!");
}
