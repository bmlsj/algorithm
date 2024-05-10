from collections import defaultdict

def solution(participant, completion):

    p_dict = defaultdict(int)
    for p in participant:
        p_dict[p] += 1

    p_dict = dict(p_dict)

    for c in completion:
        p_dict[c] -= 1

    for k, v in p_dict.items():
        if v > 0:
            return k