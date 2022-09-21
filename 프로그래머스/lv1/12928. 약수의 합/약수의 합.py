def solution(n):
    answer = 0
    answer = sum([i for i in range(1, n+1) if not (n % i)])
    return answer