def solution(x):
    
    num = sum(map(int, list(str(x))))

    if (x % num) == 0: return True
    return False 
    