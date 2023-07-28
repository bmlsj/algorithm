
n = int(input())
ans = 0
for _ in range(n):

    word = input()
    wordset = set()
    check = False

    for i in range(len(word)):
        if word[i] not in wordset:
            wordset.add(word[i])
        elif word[i] == word[i-1] and word[i-1] in wordset:
            continue
        else:
            check = True
            break

    if not check:
        ans += 1

print(ans)