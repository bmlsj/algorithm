def solution(myString):
    
    ans = []
    cnt = 0
    for s in myString:
        if s == 'x':
            ans.append(cnt)
            cnt = 0
        else:
            cnt += 1
    
    ans.append(cnt)
    
    return ans