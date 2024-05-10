def solution(x):
    
    sumX = sum(int(num) for num in str(x))
    return False if x % sumX else True