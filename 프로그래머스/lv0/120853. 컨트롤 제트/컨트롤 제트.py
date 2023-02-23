def solution(s):
    
    ans = s.split(" ")
    for i in range(len(ans)):
        if ans[i] == 'Z':
            ans[i-1] = 0
    
    n = 0
    for i in ans:
        if i != 'Z':
            n += int(i)
    
    return n
            