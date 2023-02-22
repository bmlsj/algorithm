
def solution(numbers):
    
    numbers.sort()
    
    if numbers[0] < 0 and numbers[1] < 0 and abs(numbers[0]) >= numbers[-1]:
        return abs(numbers[0]) * abs(numbers[1])
    
    else:
        return numbers[-1] * numbers[-2]
    