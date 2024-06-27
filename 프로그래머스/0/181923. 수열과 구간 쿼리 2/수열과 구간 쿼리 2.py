def solution(arr, queries):
    
    ans = []
    arrcopy = arr
    

    for i in range(len(queries)):
        s, e, k = queries[i][0], queries[i][1], queries[i][2]
        arrcopy = arr[s:e+1]
        arrcopy.sort()
        check = 0
        
        for j in range(len(arrcopy)):
            if arrcopy[j] > k:
                ans.append(arrcopy[j])
                check = 1
                break
        
        if not check:
            ans.append(-1)
                
    return ans