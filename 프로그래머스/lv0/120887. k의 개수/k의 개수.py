def solution(i, j, k):

    cnt = 0
    for n in range(i, j+1):
        for d in str(n):
            if d == str(k):
                cnt += 1
        
    return cnt