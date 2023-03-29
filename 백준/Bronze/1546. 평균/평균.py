n = int(input())
score = list(map(int, input().split()))
m = max(score)

for i in range(n):
    score[i] /= m
    score[i] *= 100

make = sum(score) / n

print(make)


