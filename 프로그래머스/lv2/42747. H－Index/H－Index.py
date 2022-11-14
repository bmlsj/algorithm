def solution(citations):
    
    # h개의 논문이 각각 최소 h 개의 인용을 갖도록 하는 가장 큰 숫자 h 
    # 먼저 f의 값을 가장 큰 값에서 가장 낮은 값으로 정렬
    # 그런 다음 f 가 위치보다 크거나 같은 마지막 위치를 찾는다 (h를 이 위치라고 함)
    answer = 0
    
    citations.sort()  # 0 1 3 5 6
    n = len(citations)
    
    for i in range(n):
        hIdx = n - i

        if citations[i] >= hIdx:
            answer = hIdx
            break
            
    return answer