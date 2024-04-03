
n = int(input())
ropes = [int(input()) for _ in range(n)]

ropes.sort(reverse=True)
result = ropes[0]

for i in range(1, n):
    if result <= ropes[i] * (i+1):
        result = max(result, ropes[i] * (i+1))

print(result)