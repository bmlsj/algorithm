def solution(n):
    
    def fibonacci(num):
        a, b = 0, 1
        for i in range(num):
            a, b = b, a+b
        return a
    
    return fibonacci(n) % 1234567