def solution(num_list):
    
    odd, even = 0, 0
    ans = 0
    for num in range(len(num_list)):
        if num % 2 == 0:
            even += num_list[num]
        else:
            odd += num_list[num]
        
    ans = max(even, odd)
    return ans