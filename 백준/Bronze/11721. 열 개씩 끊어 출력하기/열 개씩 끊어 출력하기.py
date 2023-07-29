sen = input()

ans = ''
for i in range(len(sen)):
    if i % 10 != 0:
        ans += sen[i]
    else:
        if i != 0:
            print(ans)
        ans = sen[i]

if len(ans):
    print(ans)