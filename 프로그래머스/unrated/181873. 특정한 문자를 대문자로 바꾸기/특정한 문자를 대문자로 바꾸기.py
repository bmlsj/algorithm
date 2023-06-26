def solution(my_string, alp):

    for i in range(len(my_string)):
        if my_string[i] == alp:
            my_string = str(my_string[:i] + my_string[i].upper() + my_string[i + 1:])

    return my_string