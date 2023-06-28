def solution(numbers, n):
    
    total = 0
    for num in numbers:
        if total > n:
            return total
        else:
            total += num
    
    return total