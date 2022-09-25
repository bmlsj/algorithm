def solution(s):
    
    ans = list(s)
    if (len(ans)==4 or len(ans)==6):
        for i in range(len(ans)):
            if 65 <= ord(ans[i]) < 91 or 97 <= ord(ans[i]) < 123:
                return False
        return True
    else: return False
