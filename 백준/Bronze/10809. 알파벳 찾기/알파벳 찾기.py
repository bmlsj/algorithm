
s = input()
alpha = [-1 for _ in range(26)]

for i in range(len(s)):
    id = ord(s[i]) - 97
    alpha[id] = s.index(s[i])

alpha = map(str, alpha)
print(" ".join(alpha))