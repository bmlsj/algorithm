n = input()
ans = ''
for s in n:
    if s.islower():
        ans += s.upper()
    else:
        ans += s.lower()

print(ans)