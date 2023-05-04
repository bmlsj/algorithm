n = int(input())
INF = 1005000


def is_prime(n):
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

ans = 0
for i in range(n, INF+1):
    if i == 1:
        continue

    if is_prime(i):
        num = str(i)
        if num == num[::-1]:
            ans = int(num)
            break

print(ans)