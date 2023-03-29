h, m = map(int, input().split())
c = int(input())

m += c
while m >= 60:
    h += 1
    m -= 60

    if h >= 24:
        h = 0

print(h, m)