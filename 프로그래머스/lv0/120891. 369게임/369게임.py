def solution(order):
    
    clap = ['3', '6', '9']
    cnt = 0
    
    for i in str(order):
        if str(i) in clap:
            cnt += 1
        
    return cnt