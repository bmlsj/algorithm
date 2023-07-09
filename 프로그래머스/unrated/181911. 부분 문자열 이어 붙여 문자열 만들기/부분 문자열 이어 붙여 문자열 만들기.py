def solution(my_strings, parts):
    
    ans = ''
    for i in range(len(my_strings)):
        ans += my_strings[i][parts[i][0]:parts[i][1]+1]
    
    return ans