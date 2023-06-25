def split(string):
    
    split_str = []
    tmp = ''
    for s in string:
        if s == ' ':
            split_str.append(tmp)
            tmp = ''
            continue
        tmp += s
    
    split_str.append(tmp)
    return split_str
        
def solution(my_string):
    
    return split(my_string)