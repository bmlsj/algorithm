import sys
input = sys.stdin.readline

n = int(input())
dices = [list(map(int, input().split())) for _ in range(n)]
faces = {0: 5, 1: 3, 2: 4, 3: 1, 4: 2, 5: 0}

max_ = 0
for i in range(6):
    result = []
    diceNum = [1, 2, 3, 4, 5, 6]

    # 첫번째 주사위
    diceNum.remove(dices[0][i])
    next = dices[0][faces[i]]
    diceNum.remove(next)
    result.append(max(diceNum))

    # 2번째에서 (n-1)번째 주사위
    for j in range(1, n):
        diceNum = [1, 2, 3, 4, 5, 6]
        diceNum.remove(next)
        next = dices[j][faces[dices[j].index(next)]]
        diceNum.remove(next)
        result.append(max(diceNum))

    result = sum(result)
    max_ = max(max_, result)

print(max_)
