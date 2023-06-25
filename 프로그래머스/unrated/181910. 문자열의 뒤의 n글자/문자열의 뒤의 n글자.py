def printf(strings, num):
    
    s = ''
    cnt = 0
    for i in range(len(strings)-1, -1, -1):
        
        if cnt < num:
            s += strings[i]
        
        cnt += 1
    
    return s[::-1]

def solution(my_string, n):
    return printf(my_string, n)