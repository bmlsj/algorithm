from itertools import permutations

t = int(input())

for i in range(1, t + 1):

    numlist = list(map(int, input().split()))
    select = list(permutations(numlist, 3))
    ans = set()

    for num in select:
        ans.add(sum(num))


    ans = sorted(ans)
    print(f"#{i} {ans[-5]}")
