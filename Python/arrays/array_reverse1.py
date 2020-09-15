# coding=utf8
# Declaração
vetor = []

print("Informe dez números inteiros para o vetor: ")
for i in range(0,10):
    i = int (input())
    vetor.append(i)


vetor.reverse() #inverte a lista
for i in vetor:
    print(i, end = " ")