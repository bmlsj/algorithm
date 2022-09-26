
def solution(price, money, count):
    answer = 0
    cnt = 0
    
    for i in range(count+1):
        cnt += i
    
    answer = cnt*price
    if answer < money:
        return 0
    else:
        answer -= money
        return answer