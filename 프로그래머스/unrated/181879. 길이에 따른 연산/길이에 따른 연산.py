def solution(num_list):
    
    m = 1
    for num in num_list:
        m *= num
        
    return sum(num_list) if len(num_list) >= 11 else m