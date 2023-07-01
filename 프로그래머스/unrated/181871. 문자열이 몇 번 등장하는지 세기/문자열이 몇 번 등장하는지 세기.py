def solution(myString, pat):
    
    cnt = 0
    for i in range(len(myString)):
        s = ''
        for j in range(i, len(myString)):
            s += myString[j]
            
            if s == pat:
                cnt += 1
                s = ''
                break
    
    return cnt