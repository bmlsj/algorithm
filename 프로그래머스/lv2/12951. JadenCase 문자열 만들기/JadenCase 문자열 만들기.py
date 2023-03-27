
def solution(s):

    sen = s.split(" ")
    ans = ""
    
    # lower와 upper 사용해 풀이
    for c in sen:
        if c == "":
            ans += ""
        else:
            ans += (c[0].upper()) 
            c = c.lower()
            ans += c[1:]
        ans += " "
        
    return ans[:-1]
    
    
    # capitalize() 사용
    for i in sen:
        if i == "":
            ans += ""
        else:
            ans += i.capitalize()
        ans += " "
    return ans[:-1]
