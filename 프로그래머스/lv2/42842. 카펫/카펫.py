def solution(brown, yellow):
    
    total = brown + yellow
    

    for i in range(1, total // 2 + 1):
        if total % i == 0 and (i*2 + (total//i - 2)*2) == brown:
            return [total//i, i]