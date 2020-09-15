# coding=utf8
# Declaração
vetor = []

# Entrada
for n in range(0,20):
    num = int (input("Informe {0}/20 valor para o vetor: ". format(n + 1)))
    vetor.append(num)
print("\nVetor: ", end = '')
for i in vetor:
    print(i, end = " ")
print("\nA soma do vetor é {0}".format(sum(vetor)))