def solution(phone_book):
    ans = True
    hash = {}
    
    for i in phone_book:
        hash[i] = 1

    for i in phone_book:
        tmp = ''
        for j in i:
            tmp += j
            if tmp in hash and tmp != i:
                ans = False

    return ans