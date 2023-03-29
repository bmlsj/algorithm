
a = int(input())
arr = list(map(int, input().split()))
v = int(input())

if len(arr) != a:
    exit()

print(arr.count(v))