import heapq
def solution(scoville, K):

    heapq.heapify(scoville)
    cnt = 0
    
    while scoville[0] < K and len(scoville)!=1:
            mix = heapq.heappop(scoville) + heapq.heappop(scoville)*2 
            heapq.heappush(scoville, mix)
            cnt += 1

    return -1 if scoville[0] < K else cnt
    
    
    