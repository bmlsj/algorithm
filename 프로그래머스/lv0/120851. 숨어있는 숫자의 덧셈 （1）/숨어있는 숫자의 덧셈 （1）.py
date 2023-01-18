def solution(my_string):
    
    right = ['1', '2', '3', '4', '5','6','7','8','9']
    s = 0
    for i in my_string:
        if i in right:
            s += int(i)
    
    return s
    