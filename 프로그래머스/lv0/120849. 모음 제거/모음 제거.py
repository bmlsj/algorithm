def solution(my_string):
    
    s = ''
    for i in my_string:
        if i not in "aeiou":
            s += i   
    return s