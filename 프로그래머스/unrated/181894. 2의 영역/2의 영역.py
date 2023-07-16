def solution(arr):
    
    if arr.count(2) == 0:
        return [-1]

    elif arr.count(2) == 1:
        return [2]
    
    else:
        last = 0
        for i in range(len(arr)-1, -1, -1):
            if arr[i] == 2:
                last = i
                break
                
        return arr[arr.index(2):last+1]