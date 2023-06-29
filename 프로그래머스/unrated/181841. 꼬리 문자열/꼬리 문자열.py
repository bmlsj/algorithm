def solution(str_list, ex):
    
    ans = ''
    for s in str_list:
        if ex not in s:
            ans += s
            
    return ans