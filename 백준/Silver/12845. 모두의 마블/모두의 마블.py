import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
nums.sort()

gold, lv = 0, 0

while True:

    first, end = nums[0], nums.pop()
    gold += (first + end)
    lv = max(first, end)

    nums.remove(first)
    if len(nums) == 0:
        break
    nums.append(lv)

print(gold)