def solution(my_string):
    answer = ['a', 'e', 'i', 'o', 'u']
    s = ''
    for i in my_string:
        if i not in answer:
            s += i   
    return s