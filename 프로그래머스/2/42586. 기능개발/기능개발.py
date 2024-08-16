def solution(progresses, speeds):
    answer = []
    idx = 0
    
    while True:
        for i in range(idx, len(progresses)):
            progresses[i] += speeds[i]
        
        tmp = 0
        for i in range(idx, len(speeds)):
            if progresses[idx] >= 100:
                idx += 1
                tmp += 1
            else: 
                break
        
        if tmp > 0:
            answer.append(tmp)
        if idx == len(progresses):
            break
            
    return answer