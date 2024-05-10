def solution(arr):
    
    stack = [arr[0]]
    for i in range(1, len(arr)): 
        
        if arr[i] == arr[i-1]: 
            continue
        stack.append(arr[i])
    
    return stack