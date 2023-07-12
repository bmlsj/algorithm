def solution(my_string, m, c):
    
    ans = ''
    for i in range(0, len(my_string)-m+1, m):
        s = my_string[i:i+m]
        ans += s[c-1]
    
    return ans