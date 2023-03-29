
s = input().split(" ")
ans = len(s)
for i in s:
    if i == '':
        ans -= 1
print(ans)