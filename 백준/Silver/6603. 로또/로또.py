from itertools import combinations
import sys
input = sys.stdin.readline
while True:
        k, *arr = map(int, input().split())
        if k == 0:
            break

        a = list(combinations(arr, 6))
        for i in a:
            for j in i:
                print(j, end=' ')
            print()

        print()