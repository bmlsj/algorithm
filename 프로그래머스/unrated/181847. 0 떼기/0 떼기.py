def solution(n_str):

    for n in n_str:
        if n == '0':
            n_str = n_str[1:]
        else:
            break

    return n_str

