def solution(n):
    
    num = 0
    
    for i in range(1, n + 1):        
        num += 1
                    
        while ('3' in str(num)) or (num % 3 == 0):
            num += 1
            i += 1

    return num