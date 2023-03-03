def solution(a, b):
    
    num = 1
    if a % b == 0:
        return 1
      
    
    for i in range(2, b+1):
        if a % i == 0 and b % i == 0:
            num = i
    
    b /= num
    while b % 2 == 0:
        b /= 2
    while b % 5 == 0:
        b /= 5
    
    print(b)
    return 1 if b == 1 else 2

"""    
    g = 1
    for i in range(1, b+1):
        if (a % i == 0) and (b % i == 0):
            g = i
    
    b /= g
    while b%2 == 0:
        b /= 2
    while b%5 == 0:
        b /= 5
    
    return 1 if b == 1 else 2

"""
