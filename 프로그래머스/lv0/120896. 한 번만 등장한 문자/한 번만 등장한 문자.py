def solution(s):
    """
    sarr = []
    for i in s:
        sarr.append(i)
    
    sarr.sort()    
    ans = ''

    for i in sarr:
        if sarr.count(i) == 1:
            ans += i
    
    return ans
    """
    ans = sorted([ch for ch in s if s.count(ch) == 1])
    return ''.join(ans)
        