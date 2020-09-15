# coding=utf8
# Entrada
num = int (input("Informe um número inteiro: "))

# Processamento
if num % 2 == 0:
    if num > 0:
        print("Número {0}: par positivo".format(num))
    if num == 0:
        print("Número {0}: Neutro".format(num))
    if num < 0:
        print("Número {0}: par negativo".format(num))
else:
    if num > 0:
        print("Número {0}: ímpar positivo".format(num))
    else:
        print("Número {0}: ímpar negativo".format(num))