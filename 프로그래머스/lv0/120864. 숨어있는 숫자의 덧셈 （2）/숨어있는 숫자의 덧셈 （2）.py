def solution(my_string):
    answer = 0
    
    num = ''
    
    for c in my_string:
        if c.isdigit():
            num += c
        else:
            if len(num) == 0:
                continue
            answer += int(num)
            num = ''
            
    if len(num) != 0:
        answer += int(num)
    
    return answer