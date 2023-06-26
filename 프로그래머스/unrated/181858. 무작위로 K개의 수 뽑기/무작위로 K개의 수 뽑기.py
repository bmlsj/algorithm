def solution(arr, k):
    
    arr_set = []
    for a in arr:
        if a not in arr_set:
            arr_set.append(a)
            
    result = [-1] * k
    
    for i in range(k):
        if i < len(arr_set):
            result[i] = arr_set[i]
        else:
            continue
        
    return result