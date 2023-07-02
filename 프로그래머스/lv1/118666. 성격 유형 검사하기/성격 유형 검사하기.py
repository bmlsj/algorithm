def solution(survey, choices):
    # 라이언형(R), 튜프형(T)
    # 콘형(C), 프로도형(F)
    # 제이지형(J), 무지형(M)
    # 어피치형(A), 네오형(N)
    types = []
    tp_score = {'A': 0, 'N': 0, 'C': 0, 'F': 0, 'M': 0, 'J': 0, 'R': 0, 'T': 0}
    score = [3, 2, 1, 0, 1, 2, 3]
    for idx in range(len(survey)):
        if choices[idx] >= 4:
            tp_score[survey[idx][1]] += score[choices[idx] - 1]
        else:
            tp_score[survey[idx][0]] += score[choices[idx] - 1]


    if tp_score['R'] >= tp_score['T']:
        types.append('R')
    else:
        types.append('T')

    if tp_score['C'] >= tp_score['F']:
        types.append('C')
    else:
        types.append("F")

    if tp_score['J'] >= tp_score['M']:
        types.append('J')
    else:
        types.append('M')

    if tp_score['A'] >= tp_score['N']:
        types.append('A')
    else:
        types.append('N')

    return ''.join(types)

