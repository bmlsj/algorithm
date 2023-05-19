import sys
input = sys.stdin.readline

n = int(input())
sort = {'Q1': 0, 'Q2': 0, 'Q3': 0, 'Q4': 0, 'AXIS': 0}

for _ in range(n):

    a, b = map(int, input().split())

    if a > 0 and b > 0:
        sort['Q1'] += 1

    elif a < 0 and b > 0:
        sort['Q2'] += 1

    elif a < 0 and b < 0:
        sort['Q3'] += 1

    elif a > 0 and b < 0:
        sort['Q4'] += 1

    elif a == 0 or b == 0:
        sort['AXIS'] += 1

for i in sort.keys():
    print(f"{i}: {sort[i]}")