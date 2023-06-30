import sys

input = sys.stdin.readline

n = int(input())
alpha = [0] * 26
ans = []

for _ in range(n):
    w = input().rstrip()
    for i in range(len(w)):
        alpha[ord(w[i]) - ord('A')] += pow(10, len(w) - i - 1)

for i in range(26):
    if alpha[i]:
        ans.append(alpha[i])

ans.sort(reverse=True)
num = 0
for i in range(len(ans)):
    num += ans[i] * (9 - i)

print(num)

