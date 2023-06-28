def solution(strArr):
    
    for s in range(len(strArr)):
        if s % 2 != 0:
            strArr[s] = strArr[s].upper()
        else:
            strArr[s] = strArr[s].lower()
    
    return strArr