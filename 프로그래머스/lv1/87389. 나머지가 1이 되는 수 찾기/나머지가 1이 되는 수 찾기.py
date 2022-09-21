def solution(n):
    ans = [i for i in range(1, n) if n%i == 1 ]
    return ans[0]