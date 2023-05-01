arr = []
length = []

for i in range(5):
    s = input()
    arr.append(s)
    length.append(len(s))

for i in range(max(length)):
    for j in range(5):
        if i < length[j]:
            print(arr[j][i], end='')
