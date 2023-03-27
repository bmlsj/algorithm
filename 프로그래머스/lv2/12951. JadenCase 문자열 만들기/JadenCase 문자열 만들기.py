
def solution(s):
    sen = s.split(" ")
    ans = ""
    
    for c in sen:
        if c == "":
            ans += ""
        else:
            ans += (c[0].upper()) 
            c = c.lower()
            ans += c[1:]
        ans += " "
        
    return ans[:-1]