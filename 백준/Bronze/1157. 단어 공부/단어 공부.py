s = input()
cnt = []

s = s.upper()
up = list(set(s))

for i in up:
    cnt.append(s.count(i))

if cnt.count(max(cnt)) > 1:
    print('?')
else:
    print(up[cnt.index(max(cnt))])