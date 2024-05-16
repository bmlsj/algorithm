def solution(n, lost, reserve):
    s = set()
    reserve.sort()
    lost.sort()

    for i in range(1, n + 1):
        if i in lost:
            continue
        s.add(i)

    for i in reserve:
        if i in lost:
            s.add(i)
        elif i - 1 in lost and i - 1 not in s:
            s.add(i - 1)
        elif i + 1 in lost and i + 1 not in s:
            s.add(i + 1)


    print(s)
    return len(s)