for _ in range(3):
    arr = list(map(int, input().split()))

    if arr.count(1) == 0:
        print('D')
    elif arr.count(1) == 1:
        print('C')
    elif arr.count(1) == 2:
        print('B')
    elif arr.count(1) == 3:
        print('A')
    else:
        print('E')