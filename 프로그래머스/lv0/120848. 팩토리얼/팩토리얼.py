def solution(n):
    
    def f(x):
        if x <= 1:
            return 1
        else:
            return x*f(x-1)
    
    for i in range(1, 11):
        if f(i) == n:
            return i
        elif f(i)> n:
            return i-1
    