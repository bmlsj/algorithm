def solution(cacheSize, cities):
    
    lru = []
    time = 0
    cities = [i.lower() for i in cities]
    
    for i in cities:
        if i not in lru or cacheSize == 0:   # cache miss
            time += 5
            
            if (len(lru) and len(lru) >= cacheSize):
                lru.remove(lru[0])
            lru.append(i)
        
        else:           # cache hit
            lru.remove(i)
            lru.append(i)
            time += 1

    
    return time