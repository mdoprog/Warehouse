# coding=utf8
# Declaração
e = 0
m = 0

# Entrada
p = float (input("Informe o peso: "))

# Processamento
if p > 50:
    e = p - 50
    m = e * 4
    # Saída
    print("Excesso: {0:.2f}kg".format(e))
    print("Multa: R${0:.2f}".format(m))
else:
    e = 0
    m = 0
    # Saída
    print("Excesso: {0:.2f}kg".format(e))
    print("Multa: R${0:.2f}".format(m))