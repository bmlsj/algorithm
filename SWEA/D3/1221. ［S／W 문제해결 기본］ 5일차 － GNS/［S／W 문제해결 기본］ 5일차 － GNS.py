t = int(input())
num = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
for _ in range(1, t+1):

    s, n = input().split()
    arr = list(input().split())

    for i in range(len(arr)):
        arr[i] = num.index(arr[i])

    arr = sorted(arr)
    print(s)
    for i in arr:
        print(num[i], end=' ')