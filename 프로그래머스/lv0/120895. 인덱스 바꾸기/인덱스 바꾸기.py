def solution(my_string, num1, num2):
    """
    l = []

    for i in my_string:
        l.append(i)
    
    tmp = l[num1]
    l[num1] = l[num2]
    l[num2] = tmp
    return ''.join(l)
    """
    s = list(my_string)
    s[num1],s[num2] = s[num2],s[num1]
    return ''.join(s)