def solution(score):
    
    sc = []
    for i, j in score:
        sc.append((i+j)/2)
    
    print(sc)
    
    cnt = []
    c = 1
    for i in range(len(sc)):
        c = 1
        for j in range(len(sc)):
            if sc[i] < sc[j]:
                c += 1
            
        cnt.append(c)
            
    return cnt