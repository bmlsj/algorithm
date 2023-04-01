n = int(input())
f = [0] * (n + 1)

def fibo_DP(n):
    global cnt
    f[1] = f[2] = 1
    for i in range(3, n+1):
        f[i] = f[i - 1] + f[i - 2]
        cnt += 1
    return f[n]

cnt = 0
print(fibo_DP(n), cnt)