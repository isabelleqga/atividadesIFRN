# Exercicio 1.1 - Converte um valor digitado para inteiro usando int()
num = float (input('Digite um valor: '))
print('O valor digitado foi {} e a sua porção inteira é {}'.format(num, int(num)))


# Exercicio 1.2 - Mesma conversão do 1.1, mas usando math.trunc()
from math import trunc
num = float(input('Digite um valor: '))
print('O valor digitaado foi {} e a sua porção inteira é {}'.format(num, trunc(num)))


# Exercicio 2.1 - Calcula a hipotenusa a partir dos catetos, na mão (Pitágoras)
co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacente: '))
hi = (co ** 2 + ca ** 2) ** (1/2)
print('A hipotenusa vai medir {:.2f}'.format(hi))


# Exercicio 2.2 - Mesmo cálculo do 2.1, mas usando math.hypot()
from math import hypot
co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacente: '))
hi = hypot(co, ca)
print('A hipotenusa vai medir {:.2f}'.format(hi))


# Exercicio 3 - Sorteia um aluno aleatório entre 4 digitados
import random
n1 = str(input('Primeiro aluno: '))
n2 = str(input('Segundo aluno: '))
n3 = str(input('Terceiro aluno: '))
n4 = str(input('Quarto aluno: '))
lista = [n1, n2, n3, n4]
escolhido = random.choice(lista)
print('O aluno escolhido foi {}'.format(escolhido))


# Exercicio 4 - Embaralha a ordem de apresentação de 4 alunos digitados
from random import shuffle
n1 = str(input('Primeiro aluno: '))
n2 = str(input('Segundo aluno: '))
n3 = str(input('Terceiro aluno: '))
n4 = str(input('Quarto aluno: '))
lista = [n1, n2, n3, n4]
shuffle(lista)
print('A ordem de apresentação será')
print(lista)


# Exercicio 5 - Toca um arquivo de música usando o módulo pygame
import pygame
pygame.init()
pygame .mixer.music.load('musica.mp3')
pygame.mixer.music.play()
pygame.event.wait()

'''Para que o programa rode, você terá que baixar o
módulo "pygame", e a musica que será tocada
deverá estar guardada na mesma pasta que o programa'''
