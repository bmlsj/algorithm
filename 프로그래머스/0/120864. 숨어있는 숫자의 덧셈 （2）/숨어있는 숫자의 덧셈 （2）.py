def solution(my_string):
    
    num = ''
    for c in my_string:
        if c.isdigit():
            num += c
        else:
            num += ' '
    
    return sum(int(i) for i in num.split())