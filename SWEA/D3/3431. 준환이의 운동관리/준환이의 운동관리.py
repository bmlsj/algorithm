t = int(input())

for i in range(1, t + 1):

    # l분 이상 u분 이하 운동
    l, u, x = map(int, input().split())

    if l <= x <= u:
        print(f"#{i} 0")
    elif x > u:
        print(f"#{i} -1")
    else:
        print(f"#{i} {l - x}")
