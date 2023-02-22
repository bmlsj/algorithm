def solution(s):
    
    sarr = []
    for i in s:
        sarr.append(i)
    
    sarr.sort()    
    ans = ''

    for i in sarr:
        if sarr.count(i) == 1:
            ans += i
    
    return ans
        