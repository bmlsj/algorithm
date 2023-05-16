# 0초부터 붕어빵 생산 / m초 시간을 소요해 k개 붕빵 만들기 가능
# 모든 손님들이 기다리는 시간없이 붕어빵을 제공할 수 있는 지 판별

t = int(input())

for i in range(1, t + 1):
    # n명 / m초 동안 k개 생산
    n, m, k = map(int, input().split())

    arrive = list(map(int, input().split()))
    arrive.sort()

    bong = 0
    for j in range(arrive[-1] + 1):
        if j % m == 0 and j != 0:
            bong += k

        for a in arrive:
            if j == a:
                bong -= 1
                break

        if bong < 0:
            print(f"#{i} Impossible")
            break

    if bong >= 0:
        print(f"#{i} Possible")