def solution(num_list):
    
    cnt = 0
    for num in num_list:
        while num != 1:
            cnt += 1
            if num % 2 == 0:
                num //= 2    
            else:
                num -= 1
                num //= 2
                
    return cnt