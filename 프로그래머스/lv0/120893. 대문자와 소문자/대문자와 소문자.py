def solution(my_string):
    
    s = ''
    for i in my_string:
        if i.isupper():
            s += i.lower()
        else:
            s += i.upper()
    
    return s
        