INF = 10 ** 6

def is_prime(num):
    for i in range(2, int(num ** 0.5) + 1):
       if num % i == 0:
           return False
    return True

for i in range(2, INF):
    if is_prime(i):
        print(i, end=' ')