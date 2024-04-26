n = int(input())
for i in range(n):

    ans = 0
    for num in map(int, input().split()):
        if num % 2:
            ans += num

    print(f"#{i+1} {ans}")