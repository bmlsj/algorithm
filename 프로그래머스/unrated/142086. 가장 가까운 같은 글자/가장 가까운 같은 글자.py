def solution(s):
    
    ans = []
    
    for i in range(len(s)-1, -1, -1):
        cnt = 0
        check = False
        for j in range(i-1, -1, -1):
            cnt += 1
            if s[i] == s[j]:
                ans.append(cnt)
                check = True
                break
        
        if not check:
            ans.append(-1)
            
    return ans[::-1]