def solution(my_string):
    
    my_string = list(my_string)
    
    for i in range(len(my_string)):
        for j in range(i+1, len(my_string)):
            if my_string[i] == my_string[j]:
                my_string[j] = ""
    
    return ''.join(my_string)