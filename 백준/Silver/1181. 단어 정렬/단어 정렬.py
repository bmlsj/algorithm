
n = int(input())

word = list(set(input() for _ in range(n)))
word.sort()
word.sort(key=len)

for w in word:
    print(w)