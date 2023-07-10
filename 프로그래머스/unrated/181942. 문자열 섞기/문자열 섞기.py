def solution(str1, str2):
    
    ans = ''
    for s in range(len(str1)):
        ans += str1[s]
        ans += str2[s]
    
    return ans