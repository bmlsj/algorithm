def solution(arr, flag):
    
    res = []
    for i in range(len(flag)):
        if flag[i]:
            for _ in range(arr[i]*2):
                res.append(arr[i])
        else:
            for _ in range(arr[i]):
                res.pop()
    
    return res