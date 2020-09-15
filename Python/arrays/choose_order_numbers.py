# coding=utf8
# Declaração
vetor = []
codigo = 1

# Entrada/Processamento
while codigo != 0 and codigo <= 2:
    codigo = int (input("\nDigite o código numérico: \n1 - Ordem direta \n2 - Ordem inversa \n0 - Terminar o programa\n"))
    if codigo == 1:
        vetor.clear()
        for i in range(0, 5):
            num = float (input("Digite um número: "))
            vetor.append(num)
        #Saída
        for i in vetor:
            print (i, end = " ")
            
    if codigo == 2:
        vetor.clear()
        for i in range(0, 5):
            num = float (input("Digite um número: "))
            vetor.append(num)
        vetor.reverse()
        #Saída
        for i in vetor:
            print(i, end = " ")
print("\nPrograma finalizado com sucesso.")