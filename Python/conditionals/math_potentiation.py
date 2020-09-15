#coding=utf8
# Entrada
n1, n2, n3, n4 = input("Digite quatro números: ").split()
n1 = int(n1)
n2 = int(n2)
n3 = int(n3)
n4 = int(n4)

# Processamento
q1 = pow(n1, 2)
q2 = pow(n2, 2)
q3 = pow(n3, 2)
q4 = pow(n4, 2)

if q3 >= 1000:
    print("O quadrado do número {0} é maior que mil: {1}".format(n3, q3))
else:
    print("{0} ao quadrado: {1}".format(n1, q1))
    print("{0} ao quadrado: {1}".format(n2, q2))
    print("{0} ao quadrado: {1}".format(n3, q3))
    print("{0} ao quadrado: {1}".format(n4, q4))