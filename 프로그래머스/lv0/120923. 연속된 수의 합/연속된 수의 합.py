def solution(num, total):
    
    result = []
    
    for i in range(-1010, 1000):
        result.append(i)
        
        if len(result) > num and sum(result) != total:
            result.pop(0)
        
        if sum(result) == total:
            if len(result) != num:
                result.pop(0)
            return result
            break