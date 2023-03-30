word = input()

l = len(word)
for i in range(len(word) - 1):
    if word[i:i + 2] in "z=":
        if word[i-1] == "d":
            l -= 1
        l -= 1
    elif word[i:i + 2] in ['c=', 'c-', 'd-', 'lj', 'nj', 's=']:
        l -= 1

print(l)
