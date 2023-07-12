def solution(my_string, indices):
    
    ans = ''
    for i in range(len(my_string)):
        if i not in indices:
            ans += my_string[i]
    
    return ans