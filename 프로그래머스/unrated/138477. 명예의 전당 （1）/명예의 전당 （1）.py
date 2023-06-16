def solution(k, score):
    
    legend = []
    ans = []
    for i in range(1, len(score) + 1):
        legend.sort()
        if i <= k:
            if len(legend) == k:
                legend.pop(0)
            legend.append(score[i-1])
        
        else:
            if min(legend) < score[i-1]:
                if len(legend) == k:
                    legend.pop(0)
                legend.append(score[i-1])
        
        # print(legend)
        ans.append(min(legend))
        
    return ans
    