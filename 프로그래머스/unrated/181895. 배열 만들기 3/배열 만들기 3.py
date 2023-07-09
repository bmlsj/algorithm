def solution(arr, intervals):
    
    result = []
    for x, y in intervals:
        for i in range(x, y+1):
            result.append(arr[i])
        
    return result