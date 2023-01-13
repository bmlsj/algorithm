def solution(my_string, letter):
    
    c = []
    for s in my_string:
        c.append(s)
    
    while c.count(letter) != 0:
        c.remove(letter)
    
    return ''.join(c)