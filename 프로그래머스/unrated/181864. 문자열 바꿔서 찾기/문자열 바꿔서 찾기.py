def solution(myString, pat):
    
    myStr = ''
    for s in myString:
        if s == 'A':
            myStr += 'B'
        
        elif s == 'B':
            myStr += 'A'
        
        else:
            myStr += s
    
    if pat in myStr:
        return 1
    return 0