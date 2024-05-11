def solution(array, commands):
    
    arr = []
    for i, j, k in commands:
        
        arr.append(sorted(array[i-1:j])[k-1])
    
    return arr