def solution(spell, dic):
    
    dic_cnt = [0] * len(dic)
    
    for i in range(len(dic)):
        for n in spell:
            if dic[i].count(n):
                dic_cnt[i] += 1
                
    for cnt in dic_cnt:
        if cnt == len(spell):
            return 1
    
    return 2