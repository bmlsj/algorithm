def solution(n, a, b):
    # 1 2 3 4 5 6 7 8 => 2 4

    cnt = 1
    while not((a % 2 == 0 and a - 1 == b) or (a % 2 != 0 and a + 1 == b)):
        cnt += 1
        if a % 2 == 0:
            a_idx = a // 2
        else:
            a_idx = (a + 1) // 2

        if b % 2 == 0:
            b_idx = b // 2
        else:
            b_idx = (b + 1) // 2

        a, b = a_idx, b_idx

    return cnt