from itertools import combinations
def solution(numbers):
    
    numlist = list(combinations(numbers, 2))
    ans =  [sum(i) for i in numlist]
    ans = sorted(list(set(ans)))
    return ans
    
    