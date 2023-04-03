from itertools import permutations

n = int(input())
arr = list(map(int, input().split()))

ans = 0
result = []
arrs = permutations(arr, n)
for arr in arrs:
    for i in range(len(arr)-1):
        ans += abs(arr[i] - arr[i+1])

    result.append(ans)
    ans = 0

print(max(result))