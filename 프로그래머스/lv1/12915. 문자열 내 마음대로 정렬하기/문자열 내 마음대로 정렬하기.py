def solution(strings, n):
    
    arr = []
    strings = sorted(strings)
    for i, v in enumerate(strings):
        arr.append((i, v[n]))
    
    arr = sorted(arr, key=lambda arr: arr[1])
    
    return [strings[arr[i][0]] for i in range(len(arr))]