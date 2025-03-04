n = 20
# se N for impar imprimir Weird
if n % 2 == 1:
    print('Weird')
# se N for par e estiver no range de 2 e 5 imprimir Not Weird
if n % 2 == 0 and n > 2 and n < 5:
    print('Not Weird')
# se N for par e estiver no range de 6 a 20 imprimir Weird
if n % 2 == 0 and n > 6 and n <= 20:
    print('Weird')
# se N for par e maior de 20 imprmir Not Weird
if n % 2 == 0 and n > 20:
    print('Not Weird')
