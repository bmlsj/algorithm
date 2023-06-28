def solution(my_string, index_list):
    
    s = ''
    for idx in index_list:
        s += my_string[idx]
    
    return s