from itertools import combinations
def solution(nums):
    
    num = list(combinations(nums, 3))
    cnt = 0
    for i in num:
        tmp = 0
        for j in range(2, sum(i) + 1):
            if sum(i) % j == 0:
                tmp += 1
            
        if tmp == 1:
            cnt += 1
    
    return cnt
    
    