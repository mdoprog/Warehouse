# coding=utf8
# Declaração
vlr_hora = 10.00
vlr_hora_excedente = 20.00
e = 0
# Entrada
c = int (input("Código do funcionário: "))
n = float (input("Horas trabalhadas: "))

# Processamento
if n > 50: 
    e = (n - 50) * vlr_hora_excedente
    salario = 50 * vlr_hora + e
else:
    salario = n * vlr_hora
    
# Saída
print("Salário à receber: R${0:.2f}".format(salario))
print("Salário extra: R${0:.2f}".format(e))