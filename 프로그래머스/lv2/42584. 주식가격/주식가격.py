def solution(prices):
    
    cnt = 0
    sec = []
    
    for i in range(len(prices)):
        for j in range(i+1, len(prices)):
            if prices[i] <= prices[j]:
                cnt += 1
            else: 
                cnt += 1
                break
        sec.append(cnt)
        cnt = 0
    
    return sec