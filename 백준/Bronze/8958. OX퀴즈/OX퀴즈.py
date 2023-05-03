
n = int(input())

for _ in range(n):
    arr = list(input())
    score = 0
    total = 0

    for ox in arr:
        for o in ox:
            if o == 'O':
                score += 1
                total += score
            else:
                score = 0

    print(total)
