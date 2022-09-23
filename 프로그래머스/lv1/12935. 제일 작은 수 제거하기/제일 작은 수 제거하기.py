def solution(arr):
    
    arr.pop(arr.index(min(arr)))
    if not arr: return [-1]
    return arr