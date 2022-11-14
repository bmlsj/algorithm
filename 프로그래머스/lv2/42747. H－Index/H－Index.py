def solution(citations):
    
    # h개의 논문이 각각 최소 h 개의 인용을 갖도록 하는 가장 큰 숫자 h 
    answer = 0
    
    citations.sort()  # 0 1 3 5 6
    n = len(citations)
    
    
    for i in range(n):
        hIdx = n - i
        print("cit {}".format(citations[i]))
        print(hIdx)
        if citations[i] >= hIdx:
            answer = hIdx
            break
            
    return answer