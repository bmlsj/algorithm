def solution(num_list):
    
    mult = 1
    for n in num_list:
        mult *= n
    
    return 1 if mult < sum(num_list) ** 2 else 0