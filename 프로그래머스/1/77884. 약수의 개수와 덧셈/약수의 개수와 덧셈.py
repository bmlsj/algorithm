def solution(left, right):
    
    res = 0
    for num in range(left, right + 1):
        if int(num**0.5) == num**0.5:
            res -= num
        else:
            res += num
    
    return res
