def solution(arr, idx):
    
    ans = 0
    for i in range(len(arr)):
        if i+1 > idx and arr[i] == 1:
            return i
    
    return -1