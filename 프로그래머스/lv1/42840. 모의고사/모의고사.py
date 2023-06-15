def solution(answers):
    
    first = [1, 2, 3, 4, 5]
    second = [2, 1, 2, 3, 2, 4, 2, 5]
    third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    ans = [0, 0, 0]
    for i in range(len(answers)):
        if answers[i] == first[i%5]:
            ans[0] += 1
        
        if answers[i] == second[i%8]:
            ans[1] += 1
        
        if answers[i] == third[i%10]:
            ans[2] += 1

    res = []
    for i in range(len(ans)):
        if max(ans) == ans[i]:
            res.append(i+1)
    
    res.sort()
    return res