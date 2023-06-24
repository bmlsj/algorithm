def solution(n, control):
    
    for c in control:
        if c == 'w':
            n += 1
        elif c == 's':
            n -= 1
        elif c =='d':
            n += 10
        else:
            n -= 10
            
    return n

# def solution(n, control):
#     key = dict(zip(['w','s','d','a'], [1,-1,10,-10]))
#     return n + sum([key[c] for c in control])
