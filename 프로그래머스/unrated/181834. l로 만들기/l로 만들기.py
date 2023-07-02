def solution(myString):
    
    ans = ''
    for s in myString:
        if ord(s) <= ord('l'):
            ans += 'l'
        else:
            ans += s
    
    return (ans)