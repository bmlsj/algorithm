def solution(myString):
    
    ans = ''
    for s in myString:
        if s == 'a':
            ans += s.upper()
        elif s == 'A':
            ans += s
        else:
            ans += s.lower()

    return ans