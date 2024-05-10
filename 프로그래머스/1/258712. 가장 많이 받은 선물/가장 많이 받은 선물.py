def solution(friends, gifts):
    
    jiso = [0] * len(friends)
    getgift = [[0] * len(friends) for _ in range(len(friends))]     
    
    for gift in gifts:
            a, b = gift.split(" ")
            getgift[friends.index(a)][friends.index(b)] += 1
    
    for i in range(len(friends)):
        name = friends[i]
        
        for gift in gifts:
            a, b = gift.split(" ")
            # 선물 지수
            if a == name:
                jiso[i] += 1
            elif b == name:
                jiso[i] -= 1
    
    gift = [0] * len(friends)
    for i in range(len(getgift)):
        for j in range(len(getgift)):
            if i == j:
                continue
            
            elif getgift[i][j] < getgift[j][i]:
                gift[j] += 1
            
            elif getgift[i][j] == getgift[j][i]:
                if jiso[i] < jiso[j]:
                    gift[j] += 1
                elif jiso[i] == jiso[j]:
                    continue
    
    return max(gift)