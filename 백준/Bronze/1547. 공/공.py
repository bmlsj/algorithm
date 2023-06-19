import sys
input = sys.stdin.readline

n = int(input())

switch = [list(map(int, input().split())) for _ in range(n)]
cups = [1, 0, 0]

for a, b in switch:
    cups[a-1], cups[b-1] = cups[b-1], cups[a-1]

for i in range(3):
    if cups[i] == 1:
        print(i+1)