def solution(my_string):
    
    s = []
    for c in my_string:
        s.append(c)
    
    return "".join(s[::-1])