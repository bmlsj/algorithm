def solution(k, score):
    
    legend = []
    ans = []
    for i in range(1, len(score) + 1):
        
        legend.append(score[i-1])
        
        if len(legend) > k:
            legend.remove(min(legend))

        ans.append(min(legend))
        
    return ans
    