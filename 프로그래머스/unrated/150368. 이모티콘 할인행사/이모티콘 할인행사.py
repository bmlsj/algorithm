from itertools import product


def solution(users, emoticons):
    percentage = [10, 20, 30, 40]
    emo_percent = list(product(percentage, repeat=len(emoticons)))
    # print(emo_percent)

    cashlist = [list(0 for _ in range(len(users))) for _ in range(len(emo_percent))]
    plus = [0 for _ in range(len(emo_percent))]

    for k in range(len(emo_percent)):
        for i in range(len(users)):
            cash = 0
            for j in range(len(emoticons)):
                if users[i][0] <= emo_percent[k][j]:
                    cash += int(emoticons[j] * (100 - emo_percent[k][j]) / 100)

                if cash >= users[i][1]:
                    cash = 0
                    plus[k] += 1
                    break

            cashlist[k][i] += cash

    max_cash = 0
    max_plus = max(plus)
    for i in range(len(plus)):
        if plus[i] == max(plus):
            max_cash = max(sum(cashlist[i]), max_cash)

    return [max_plus, max_cash]