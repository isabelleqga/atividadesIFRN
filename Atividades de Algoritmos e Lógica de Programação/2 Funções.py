# Media de Notas - Calcula a média de 3 notas de um aluno e mostra o resultado num dicionário
aluno = input("Digite o nome do aluno:")
n1 = float(input("Digite a nota:"))
n2 = float(input("Digite a nota:"))
n3 = float(input("Digite a nota:"))

def media (n1,n2,n3,aluno):
    m = int((n1+n2+n3)/3)
    x = {aluno : m}
    print(x)
print(media(n1,n2,n3, aluno))


# Questao 1 - Compara o tamanho de duas listas geradas a partir de dois limites digitados
def funcao(a,b):
    list1 = list(range(0,(a+1),25))
    list2 = list(range(0,(b+1),15))
    if len(list1) > len(list2):
        print("A lista1",list1,"é maior, com", (len(list1)), "elementos")
    elif len(list2) > len(list1):
        print("A lista2",list2,"é maior, com", (len(list2)), "elementos")
    else:
        print("Lista são de tamanhos iguais")
    return
x = int(input("Digite o limite da lista1:"))
w = int(input("Digite o limite da lista2:"))
print(funcao(x,w))


# Questao 2 - Adiciona e depois remove elementos de uma lista, mostrando o tamanho antes e depois
def funcao ():
    lista1 = ['a','b','c']
    lista2 = ['y']
    lista1.append (lista2)
    print("A lista tem ",len(lista1), "elementos")
    lista1.remove('a')
    lista1.remove('b')
    lista1.remove('c')
    print("...")
    print("A lista tem ",len(lista1), "elementos")
    return
print(funcao())


# Questao 3 (int) - Verifica o Último Teorema de Fermat (a^n + b^n = c^n) com entradas inteiras
def teorema(a,b,c,n):
    tem = a**n+ b**n==c**n
    return tem
a = int(input("Digite a: "))
b = int(input("Digite b: "))
c = int(input("Digite c: "))
n = int(input("Digite n: "))
if(teorema(a,b,c,n)) == False:
    print("O Teorema está correto")
else:
    print("O Teorema está incorreto")


# Questao 3 (float) - Mesma verificação do Teorema de Fermat, mas com entradas em ponto flutuante
def teorema(a,b,c,n):
    tem = a**n+ b**n==c**n
    return tem
a = float(input("Digite a: "))
b = float(input("Digite b: "))
c = float(input("Digite c: "))
n = float(input("Digite n: "))
if(teorema(a,b,c,n)) == False:
    print("O Teorema está correto")
else:
    print("O Teorema está incorreto")


# Questao 4 - Conta quantas vezes um elemento digitado aparece em uma lista fixa de nomes
def funcao():
    nomes = ['a', 'b', 'c', 'd', 'a','that', 'is', 'lame', 'i', 'am', 'depressed', ':)']
    x = input("Digite o que deve ser procurado:")
    print ("O elemento",x,"foi encontrado",nomes.count(x),"vezes.")
    return
print(funcao())
