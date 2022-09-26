def solution(n):
    ans = 0
    rev_base = ""

    while n > 0:
        n, mod = divmod(n, 3)
        rev_base += str(mod)
        
    ans = int(rev_base, 3)
    return ans

    return answer
