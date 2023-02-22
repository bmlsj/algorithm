def solution(numbers, k):

    n = 1
    
    for i in range(k-1):
        n += 2
        if n > len(numbers):
            n -= len(numbers)

    
    return n
