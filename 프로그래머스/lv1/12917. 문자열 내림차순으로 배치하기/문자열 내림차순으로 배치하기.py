def solution(s):

    ans = list(s)
    ans.sort(reverse=True)
    
    return "".join(ans)