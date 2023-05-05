t = int(input())

for a in range(1, t + 1):
    # n : 총 문제 수
    n = int(input())
    scorelist = list(map(int, input().split()))

    result = [0] * (sum(scorelist) + 1)
    result[0] = 1
    for score in scorelist:
        for i in range(len(result) - score, -1, -1):
            if result[i]:
                result[i + score] = 1

    print(f"#{a} {sum(result)}")
