def solution(k, tangerine):
    answer = 0
    tangerine.sort()
    map = {}
    
    for num in tangerine:
        if num not in map:
            map[num] = 0
        map[num] += 1
    
    map = dict(sorted(map.items(), key = lambda x:x[1], reverse=True))
    tmp = 0
    for key, num in map.items():
        if map[key] > 0 and tmp < k:
            while map[key] > 0:
                tmp += 1
                map[key] -= 1
    
    for key, num in map.items():
        if num == 0:
            answer+=1
    return answer