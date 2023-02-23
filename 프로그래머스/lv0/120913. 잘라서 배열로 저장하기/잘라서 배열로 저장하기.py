def solution(my_str, n):
    
    ans = []
    s = ''

    for i in my_str:
        s += i
        if len(s) == n:
            ans.append(s)
            s = ''
            
    if len(s) != 0:
        ans.append(s)
    return ans