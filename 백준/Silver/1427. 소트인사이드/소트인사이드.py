n = input()
num = []
for i in n:
    num.append(int(i))

num = sorted(num, reverse=True)
num = map(str, num)
print(''.join(num))