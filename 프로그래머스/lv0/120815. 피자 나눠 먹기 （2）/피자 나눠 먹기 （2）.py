def solution(n):
    
    i = 1
    while True:
        if (6 * i) % n == 0:
            break        
        i += 1
    
    return i
        