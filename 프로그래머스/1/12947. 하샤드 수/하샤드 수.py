def solution(x):
    
    sumX = sum(int(num) for num in str(x))
    return x % sumX ==0