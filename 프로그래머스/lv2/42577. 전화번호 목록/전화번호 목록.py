def solution(phone_book):
    answer = 0
    phone_book.sort()
    find = phone_book[0]

    v = []
    for i in range(1, len(phone_book)):
        v.append(phone_book[i][:len(phone_book[0])])
    
    print(v)
    for idx, value in enumerate(v):
        if value == find:
            answer += 1

        else:
            answer += 0

    if answer != 0:
        return False
    else: return True
