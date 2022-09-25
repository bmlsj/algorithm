def solution(n):
    ans = ""
    for i in range(1, n+1):
        if i%2:
            ans += "수"
        else:
            ans += "박"
    return ans
    