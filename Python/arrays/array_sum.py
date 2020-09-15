# coding=utf8
#Declaração
vetor = []
soma = 0

print("Digite vinte números inteiros para o vetor: ")
for i in range (0,20):
    i = int(input())
    vetor.append(i)
    soma = soma + i
    
print("Vetor: ", end = '')
for i in vetor:
    print(i, end = " ")
print("\nSoma: {0}". format(soma))