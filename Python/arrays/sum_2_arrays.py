# coding=utf8
# Declaração
vetor1 = []
vetor2 = []
soma = []

#Entrada
for i in range (0, 10):
    num1 = int (input("Digite um número para o primeiro vetor: "))
    vetor1.append(num1)
    num2 = int (input("Digite um número para o segundo vetor: "))
    vetor2.append(num2)
    soma.append(num1 + num2)
    
#Saída
for i in soma:
    print(i)