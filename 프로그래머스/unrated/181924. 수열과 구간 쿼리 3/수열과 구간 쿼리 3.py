def solution(arr, queries):
    
    for o, n in queries:
        arr[o], arr[n] = arr[n], arr[o]
    
    return arr