def solution(numbers):
    answer = -1
    sum = 0
    for num in numbers:
        sum += num
    answer = 45 - sum
    
    return answer