# coding=utf8
#Entrada
sal_hora = float (input("Quanto você ganha por hora? "))
horas_trab = int (input("Quantas horas você trabalhou neste mês? "))

#Processamento
salario = sal_hora * horas_trab

#Saída
print("Neste mês você vai receber R$ {0:.2f}".format(salario))