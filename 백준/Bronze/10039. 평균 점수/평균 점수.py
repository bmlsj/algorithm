score = 0

for _ in range(5):

    num = int(input())
    if num < 40:
        score += 40
    else:
        score += num

print(score // 5)