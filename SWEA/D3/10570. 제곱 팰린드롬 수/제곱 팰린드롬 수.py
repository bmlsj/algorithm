t = int(input())

def palindrom(n):
    if float(int(n)) == n:
        n = str(int(n))
        if n == n[::-1]:
            return 1
        return 0

for i in range(1, t + 1):

    a, b = map(int, input().split())
    ans = 0

    for num in range(a, b + 1):
        if palindrom(num) and palindrom(num ** 0.5):
            ans += 1

    print(f"#{i} {ans}")
