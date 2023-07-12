def solution(arr):
    
    l = len(arr)
    i = 0
    while True:
        if l <= (2**i):
            break
        i += 1

    for _ in range((2**i) - l):
        arr.append(0)
    
    return arr