# coding=utf8
# Declaração
vetor = []
maior50 = False

for i in range(0, 10):
    num = int(input("Informe o número {0}/10 para o vetor: ".format(i + 1)))
    vetor.append(num)
    
for i in vetor:
    if i > 50:
        print("\nO número {0} está na posição {1}/10".format(i, vetor.index(i) + 1))
        maior50 = True

if maior50 == False:
    print("\nNenhum número acima de 50 foi digitado")