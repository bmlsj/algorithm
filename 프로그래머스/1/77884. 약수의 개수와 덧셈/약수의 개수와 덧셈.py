def solution(left, right):
    
    res = 0
    for num in range(left, right + 1):
        if not check(num):
            res += num
        else:
            res -= num
    
    return res
    
        
def check(num):
    cnt = 0
    for i in range(1, num + 1):
        if num % i == 0:
            cnt += 1

    return cnt % 2