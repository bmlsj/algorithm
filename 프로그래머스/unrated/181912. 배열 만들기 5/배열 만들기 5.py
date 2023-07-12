def solution(intStrs, k, s, l):
    
    ans = []
    for n in intStrs:
        if int(n[s:s+l]) > k:
            ans.append(int(n[s:s+l]))
    
    return ans