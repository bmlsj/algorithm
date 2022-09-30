def solution(progresses, speeds):
    l = []
    s = []
    data = 0 
    
    for i in range(len(speeds)):
        for d in range(1, 101):
            data = progresses[i] + speeds[i] * d
            
            if data >= 100:
                s.append(d)
                break
    
    cnt = 1
    a = s[0]
    for i in range(1, len(s)):       
        if a < s[i]:
            l.append(cnt)
            a = s[i]
            cnt = 1
        
        else:
           cnt += 1
    
    l.append(cnt)
    
    return l
            
            
    