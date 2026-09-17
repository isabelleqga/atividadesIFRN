# Questao 1 - Soma uma série de 25 termos envolvendo um número digitado, usando for
x = int(input("Digite o número:"))
s = 0
for n in range(1,26):
    s = s - (n/x**n)
print(s)


# Questao 2 - Mesma ideia com while, mas a condição de parada (soma == -100) raramente é atingida
x = 0
soma = 0
while soma != -100:
    x = x + 1
    soma = soma + (x**(1/x)-(x**2))
    print(soma)
print(soma)
#dont stop what yo doing
#nunca para mas isso n é problema meu


# Questao 2.2 - Mesmo cálculo do 2, mas com um contador que garante a parada do loop
x = 0
soma = 0
a = 0
while a != -100:
    x = x + 1
    soma = soma + (x**(1/x)-(x**2))
    a = a - 1
print(soma)
#nesse para rs


# Questao 3 - Registra pedidos de 3 produtos até digitar 0, e calcula valor total e média
valorfinal = 0
mediadepedidos = 0
qa = 0
qb = 0
qc = 0
print("Para fazer um pedido, digite qualquer coisa. Para finalizar, digite 0.")
ped = input()
while ped != "0":
    qqa = (int(input("Quantidade de a:")))
    qqb = (int(input("Quantidade de b:")))
    qqc = (int(input("Quantidade de c:")))
    qa = qa + qqa
    qb = qb + qqb
    qc = qc + qqc
    print("Para fazer outro pedido, digite qualquer coisa. Para finalizar, digite 0.")
    ped = input(":")
valorfinal = (25 * qa) + (35 * qb) + (45 * qc)
media = (qa + qb + qc) /3
print("Valor apurado: R$",valorfinal)
print("Media de pedidos:",media)


# Questao 4 - Soma acumulada das divisões entre todos os pares de elementos de duas listas
a = [10,20,30,40,50]
b = [5,6,7,8,9]
resp = 0
res = 0
for i in range(4):
    for n in range (4):
        res = a[i]/b[n]
        resp = res + resp
print(resp)
