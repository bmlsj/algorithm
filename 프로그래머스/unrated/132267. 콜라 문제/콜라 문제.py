def solution(a, b, n):
    cola = n
    ans = 0
    while cola > a:
        curr_cola = cola
        ans += (cola // a) * b
        cola %= a
        cola += (curr_cola // a) * b

    return ans + (cola // a) * b if cola >= a else ans