def solution(array, n):
    
    diff = []
    array.sort()
    for i in array:
        diff.append(abs(n-i))
    
    
    return array[diff.index(min(diff))]
    