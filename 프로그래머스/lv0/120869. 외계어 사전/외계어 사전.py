
from itertools import permutations

def solution(spell, dic):
    
    s = list(permutations(spell, len(spell)))
    ans = []
    for i in s:
        ans.append(''.join(i))
            
    if any(i in ans for i in dic):
        return 1
    else:
        return 2