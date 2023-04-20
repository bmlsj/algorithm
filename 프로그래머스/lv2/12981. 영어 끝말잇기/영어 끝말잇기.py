def solution(n, words):
    
    result = []
    
    for i in range(len(words)-1, 0, -1):
        for j in range(i-1, -1, -1):
            if words[i] == words[j]:
                result.append(i)
                break
    
    for i in range(len(words)-1):
        if words[i][-1] != words[i+1][0]:
            result.append(i+1)
            break
    
    print(result)
    if len(result):
        cnt = min(result) // n + 1
        who = (min(result) % n) + 1
        return [who, cnt]
    else:
        return [0, 0]
    
    

    