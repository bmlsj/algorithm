def solution(s):
    
    cnt, rm_zero = 0, 0
    while len(s) != 1:
        tmp = ""
        for i in s:
            if i != '0':
                tmp += i
            else:
                rm_zero += 1
        cnt += 1
        s = bin(len(tmp))[2:]
        
    return [cnt, rm_zero]