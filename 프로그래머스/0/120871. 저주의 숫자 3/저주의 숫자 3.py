def solution(n):
    # 3이거나 3의 배수
    cnt = 0
    for num in range(1, n + 1):
        cnt += 1
        
        while cnt % 3 == 0 or '3' in str(cnt):
            cnt += 1


    return cnt