t = int(input())

for i in range(1, t + 1):

    n = list(input())
    l = len(n)
    start = ['0'] * l
    cnt = 0
    zero_idx = 0

    while n != start:

        idx = n.index('1', zero_idx, l)
        cnt += 1
        for a in range(idx, l):
            start[a] = '1'

        if n == start:
            break

        zero_idx = n.index('0', idx, l)
        cnt += 1
        for a in range(zero_idx, l):
            start[a] = '0'

    print(f"#{i} {cnt}")