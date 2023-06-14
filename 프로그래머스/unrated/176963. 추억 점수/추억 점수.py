def solution(name, yearning, photo):
    
    score = {}
    no_name = 0
    for i in range(len(name)):
        score[name[i]] = yearning[i]
        no_name += yearning[i]
    
    ans = []
    for people in photo:
        res = 0
        for man in people:
            if man in score.keys():
                res += score[man]
            else:
                continue
                
        ans.append(res)
    
    return ans