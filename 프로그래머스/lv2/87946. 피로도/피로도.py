from itertools import permutations


def solution(k, dungeons):

    result = []

    for dungeon in list(permutations(dungeons, len(dungeons))):
        res = 0
        k_cp = k
        for i in range(len(dungeon)):
            최소필요, 소모 = dungeon[i][0], dungeon[i][1]
            if k_cp >= 최소필요:
                k_cp -= 소모
                res += 1

        result.append(res)

    return max(result)
