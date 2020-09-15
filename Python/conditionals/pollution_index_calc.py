# coding=utf8
# Entrada
indice = float (input("Informe o índice de poluição: "))

if indice >= 0.5:
    print("Todos os Grupos devem Suspender suas atividades!")
elif indice >= 0.4:
    print("Grupo 1 e Grupo 2 - Suspender suas atividades")
elif indice >= 0.3:
    print("Grupo 1 - Suspender suas atividades")
else:
    print("Aceitável")