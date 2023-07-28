word = input()
alpabet = [0] * 26

for w in word:
    alpabet[ord(w) - 97] += 1

for a in alpabet:
    print(a, end=' ')