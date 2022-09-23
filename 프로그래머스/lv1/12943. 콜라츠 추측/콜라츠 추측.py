def solution(num):
    cnt = 0
    
    while num != 1:        

        if num == 1:
            break
        
        if not (num%2):     # 짝수
            num /= 2
            cnt += 1
        else:               # 홀수
            num = num*3 + 1
            cnt += 1
            
        if cnt > 500:
            return -1
            break    
    return cnt