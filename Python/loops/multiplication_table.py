# coding=utf8
# Entrada
num = int (input("Informe um número entre 1 e 10 para ver a tabuada: "))

# Processamento
while num < 1 or num > 10:
    num = int (input("Informe um número entre 1 e 10 para ver a tabuada: "))
print("Tabuada de {0}".format(num))
for i in range (0, 11):
    print("{0} X {1} = {2}".format(num, i, (num * i)))