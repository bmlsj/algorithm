n = int(input())

for _ in range(n):
    s = list(input())
    arr = []
    for i in s:
        if i == '(':
            arr.append(i)
        elif i == ')':
            if len(arr) == 0:
                arr.append(i)
                break
            else:
                arr.pop()

    if len(arr) == 0:
        print("YES")
    else:
        print("NO")