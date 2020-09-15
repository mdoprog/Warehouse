# coding=utf8
# Declaração
quantidade = 0
def1 = 0
def2 = 0
def3 = 0
def4 = 0

# Entrada
id_equip = int (input("Digite o código do equipamento: "))
while id_equip != 0:
    print("Informe o tipo de defeito: ")
    print("1 - Necessita de esfera")
    print("2 - Necessita de limpeza")
    print("3 - Necessita troca do cabo ou conector")
    print("4 - Quebrado ou inutilizado")
    print("Selecione uma ou mais opçoes de acordo com o defeito: ")
    # Processamento
    defeito = int (input())
    if defeito == 1:
        def1 += 1
    if defeito == 2:
        def2 += 1
    if defeito == 3:
        def3 += 1
    if defeito == 4:
        def4 += 1
    quantidade += 1
    id_equip = int (input("Digite o código do equipamento: \n"))

# Saída
print("Quantidade de mouses: {0}\n".format(quantidade))
print("        Situação                        Quantidade    Percentual")
print("1 - Necessita de esfera                    {0}           {1:.1f}%".format(def1, def1 * 100 / quantidade))
print("2 - Necessita de limpeza                   {0}           {1:.1f}%".format(def2, def2 * 100 / quantidade))
print("3 - Necessita troca do cabo ou conector    {0}           {1:.1f}%".format(def3, def3 * 100 / quantidade))
print("4 - Quebrado ou inutilizado                {0}           {1:.1f}%".format(def4, def4 * 100 / quantidade))