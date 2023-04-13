def solution(n):
    
    cnt = 0
    arr = []
    for i in range(1, n+1):
        maxCount = int(n / i)
        tmp = 1
        s = i
        arr = [i]
        
        for j in range(i+1, n+1):
            if tmp > maxCount:
                break
            
            s += j
            arr.append(j)
            tmp += 1
            if s == n:
                cnt += 1
                # print(arr)
                break
        
        
    return cnt + 1