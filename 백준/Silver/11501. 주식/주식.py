import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t):

    n = int(input())
    nums = list(map(int, input().split()))
    nums = nums[::-1]

    total = 0
    m = nums[0]
    for i in range(n-1):
        if m > nums[i+1]:
            total += (m - nums[i+1])
        else:
            m = nums[i+1]

    print(total)
