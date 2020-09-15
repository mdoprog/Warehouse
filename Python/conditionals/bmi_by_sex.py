# coding=utf8
# Entrada
altura = float (input("Informe a altura: "))
sexo = input ("Informe o sexo (M/F): ")

# Processamento
if sexo.lower() == 'm':
    peso_ideal = 72.7 * altura - 58
elif sexo.lower() == 'f':
    peso_ideal = 62.1 * altura - 44.7
else:
    peso_ideal = 0
    print ("Sexo não reconhecido")

# Saída
print ("Peso ideal: {0:.2f}kg".format(peso_ideal))