def solution(num_list):
    
    c = [0, 0]
    
    for i in num_list:
        if i % 2 == 0: # 짝수
            c[0] += 1
        else:
            c[1] += 1
    
    return c