def solution(l, r):
    
    ans = []
    
    n_list = ['1', '2', '3', '4', '6', '7', '8', '9']
    for num in range(l, r+1):
        check = True
        for n in str(num):
            if n in n_list:
                check = False
                break
        
        if check:
            ans.append(num)
        
    
    
    return ans if len(ans) else [-1]