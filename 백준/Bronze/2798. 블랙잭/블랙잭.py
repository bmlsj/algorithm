from itertools import combinations
import sys
input = sys.stdin.readline

n, total = map(int, input().split())
card = list(map(int, input().split()))
card_pick = list(combinations(card, 3))
result = 0

for i in card_pick:
    if sum(i) <= total:
        result = max(result, sum(i))

print(result)