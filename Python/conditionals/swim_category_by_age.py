# coding=utf8
# Entrada
idade = int (input("Qual é a idade do nadador? "))

# Processamento
if idade >= 18:
    categoria = 'Adulto'
elif idade >= 14:
    categoria = 'Juvenil B'
elif idade >= 12:
    categoria = 'Juvenil A'
elif idade >= 8:
    categoria = 'Infantil B'
elif idade >= 5:
    categoria = 'Infantil A'
else:
    categoria = 'Nenhuma'
    
# Saída
print("Categoria: {0}".format(categoria))