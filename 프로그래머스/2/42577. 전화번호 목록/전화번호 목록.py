def solution(phone_book):
    ps = dict()
    for p in phone_book:
        for i in range(1, len(p)):
            ps[p[:i]] = 1

    for p in phone_book:
        if p in ps:
            return False

    return True