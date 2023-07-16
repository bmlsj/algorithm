def solution(arr):
    
    ans = arr.copy()
    cnt = 0
    
    while True:
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] //= 2
            elif arr[i] < 50 and arr[i] % 2:
                arr[i] *= 2
                arr[i] += 1
        
        if all(arr[i] == ans[i] for i in range(len(arr))):
             break
                
        ans = arr.copy()
        cnt += 1
        
    return cnt