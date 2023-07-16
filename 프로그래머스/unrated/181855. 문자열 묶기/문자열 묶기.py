def solution(strArr):
    
    strArr.sort(key=len)
    charLen = 1
    ans = {len(s): 0 for s in strArr}
    for s in strArr:
        ans[len(s)] += 1
    
    return max(ans.values())
            