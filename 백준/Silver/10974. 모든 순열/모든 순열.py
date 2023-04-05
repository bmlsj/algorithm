import sys

input = sys.stdin.readline

n = int(input())
arr = [i for i in range(1, n + 1)]

def permutations(arr, n):
    result = []

    if n == 0:
        return [[]]

    for i, e in enumerate(arr):
        for p in permutations(arr[:i] + arr[i + 1:], n - 1):
            result += [[e] + p]

    return result

ans = permutations(arr, n)

for i in range(len(ans)):
    for j in ans[i]:
        print(j, end=' ')
    print()