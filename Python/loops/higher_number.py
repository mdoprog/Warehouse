# coding=utf8
# Declaração
maior = 0
# Entrada
num = int (input ("Digite um número qualquer ou 0 (zero) para Sair: "))
while num != 0:
    if num > maior:
        maior = num
    num = int (input("Digite um número qualquer ou 0 (zero) para Sair: "))
print("Maior número: {0}".format(maior))