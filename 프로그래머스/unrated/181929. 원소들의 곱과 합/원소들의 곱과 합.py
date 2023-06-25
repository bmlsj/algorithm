def Sum(numlist):
    
    total = 0
    for n in numlist:
        total += n
    
    return total

def solution(num_list):
    
    mult = 1
    for n in num_list:
        mult *= n
    
    return 1 if mult < Sum(num_list) ** 2 else 0