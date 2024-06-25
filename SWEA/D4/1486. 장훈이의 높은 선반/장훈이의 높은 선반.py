from itertools import combinations

T = int(input())


def solution(arr, n, b):
    ans = []
    for i in range(1, n + 1):
        for nums in list(combinations(arr, i)):
            if sum(nums) >= b:
                ans.append(sum(nums))

    return min(ans) - b

for t in range(T):
    n, b = map(int, input().split())
    arr = list(map(int, input().split()))


    print(f"#{t+1} {solution(arr, n, b)}")
