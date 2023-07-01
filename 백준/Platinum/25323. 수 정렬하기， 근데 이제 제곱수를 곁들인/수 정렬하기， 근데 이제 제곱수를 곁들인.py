import math

n = int(input())
num = list(map(int, input().split()))
copy_num = num.copy()
num.sort()

check = True
for i in range(n):
    if int(math.isqrt(num[i]*copy_num[i]))**2 == num[i] * copy_num[i]:
        continue
    else:
        check = False
        break

if check:
    print("YES")
else:
    print("NO")