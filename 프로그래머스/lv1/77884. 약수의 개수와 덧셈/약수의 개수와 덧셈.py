def solution(left, right):
    ans = 0 
    result = 0
    # 약수 
    for num in range(left, right+1):
        cnt = 0
        for i in range(1, num+1):
            if num%i == 0:
                cnt += 1
    
        if cnt % 2 == 1:   # 홀수
            result -= num
        else:
            result += num
            
    return result
    