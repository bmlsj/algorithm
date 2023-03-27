
def solution(s):
    sen = s.split(" ")
    ans = ""
    
    for c in sen:
        if c == "":
            ans += ""
        elif c[0].islower():
            ans += (c[0].upper())             
            c = c.lower()
            ans += c[1:]
        else:
            ans += c[0]
            c = c.lower()
            ans += c[1:]
        ans += " "
        
    return ans[:-1]