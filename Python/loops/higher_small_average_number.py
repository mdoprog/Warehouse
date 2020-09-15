# coding=utf8

maior = -999
menor = 999
soma = 0

#Entrada / Processamento
print("Informe dez números positivos: ")
for i in range (1, 11):
    num = int (input())
    
    #Processamento
    while num < 0:
        
        #Entrada
        num = int (input("Informe um número positivo: "))
    if num > maior:
        maior = num
    if num < menor:
        menor = num
    soma = soma + num
media = soma / 10

#Saída
print("Maior valor: {0}".format(maior))
print("Menor valor: {0}".format(menor))
print("Média: {0}".format(media))