from itertools import combinations

def solution(number):
    
    num = list(combinations(number, 3))
    cnt = 0
    for i in num:
        if sum(i) == 0:
            cnt += 1
    
    # return cnt
    return len([i for i in list(combinations(number, 3)) if sum(i) == 0])