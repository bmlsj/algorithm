def solution(num, k):
    
    s = [i for i in str(num)]
    return -1 if str(k) not in s  else s.index(str(k)) + 1
        