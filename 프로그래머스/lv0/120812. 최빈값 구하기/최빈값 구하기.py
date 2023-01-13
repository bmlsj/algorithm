def solution(array):
    
    """ 
    # array의 최소값이 0이라는 것을 고려하지 못함
    num = [0 for i in range(max(array)+1)]
    
    for i in array:
        num[i] = array.count(i)

    print(num)
    if num.count(max(num)) > 1:
        return -1

    return max(num)
    """
    
    num = list(set(array))
    
    c = []  # 빈도 리스트
    for i in num:
        cnt = 0
        for j in array:
            if i == j:
                cnt += 1            
        c.append(cnt)
    
    if c.count(max(c)) > 1:
        return -1
    
    # 최대 빈도 수를 출력하고 있음 => 최대 빈도 수를 가지는 값을 출력할 것
    return num[c.index(max(c))]
