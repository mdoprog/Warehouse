# coding=utf8
# Entrada
usuario = input("Digite o nome de usuário: ")
senha = input("Digite a senha: ")

# Processamento
while senha == usuario:
        print("Senha incorreta! A senha deve ser diferente do nome de usuário.")
        usuario = input("Digite o nome de usuário: ")
        senha = input("Digite a senha: ")
print("Login realizado com sucesso!")