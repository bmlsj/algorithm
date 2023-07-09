def solution(arr):
    
    ans = True
    for i in range(len(arr)):
        for j in range(len(arr)):
            if arr[i][j] != arr[j][i]:
                ans = False
                break
    
    return 1 if ans else 0