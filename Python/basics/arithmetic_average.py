# coding=utf8
# Entrada
quantidade_minima = int (input("Informe a quantiddade mínima: "))
quantidade_maxima = int (input("Informe a quantidade máxima: "))
# Processamento
estoque_medio = (quantidade_minima + quantidade_maxima) / 2
# Saída
print("O estoque médio é: {0}".format(estoque_medio))