def solution(n, lost, reserve):
    
    출석 = 0
    체육복 = {}
    for i in range(1, n+1):
        if i in reserve and i in lost:
            체육복[i] = 1
        elif i in lost:
            체육복[i] = 0
        elif i in reserve:
            체육복[i] = 2
        else:
            체육복[i] = 1
    
    lost.sort()
    reserve.sort()
    for i in lost:
        for re in reserve:
            if re - 1 == i and 체육복[re] > 1:
                체육복[re-1] = 1
                체육복[re] -= 1
                break
            
            elif 체육복[re] > 1 and re + 1 == i:
                체육복[re+1] = 1
                체육복[re] -= 1
                break
                
    print(체육복)
    
    return len([i for i in 체육복.values() if i > 0])