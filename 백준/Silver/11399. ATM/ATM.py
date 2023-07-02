import sys

n = int(input())
arr = list(map(int, input().split()))

order = []
for i, v in enumerate(arr):
    order.append([i, v])

order = sorted(order, key=lambda t:t[1])

time = 0
for i in range(len(order)):
    for t in range(i+1):
        time += order[t][1]

print(time)