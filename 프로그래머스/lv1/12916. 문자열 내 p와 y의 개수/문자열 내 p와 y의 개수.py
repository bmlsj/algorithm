def solution(s):
    
    s = s.lower()
    ans = list(s)
    if ans.count('p') == ans.count('y'): return True
    elif not ans.count('p') and not ans.count('y'): return True
    else : return False
    
    return True