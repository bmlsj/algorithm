def solution(lottos, win_nums):
    
    min_rank = 0
    win_num = {6: 1, 5: 2, 4: 3, 3: 4, 2: 5, 1: 6, 0: 6}
    for lotto in lottos:
        if lotto in win_nums:
            min_rank += 1
    
    
    return [win_num[min_rank + lottos.count(0)], win_num[min_rank]]