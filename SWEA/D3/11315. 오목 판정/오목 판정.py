
t = int(input())

def rl_digo(i, j):
    ans = False
    # 오른쪽 아래 대각선

    if arr[i][j] == 'o':
        a = cnt = 0
        while arr[i + a][j + a] == 'o' and 0 <= i + a < n and 0 <= j + a < n:
            cnt += 1
            a += 1

            if cnt == 5:
                ans = True
                return ans

            if i + a >= n or j + a >= n:
                break

    return ans


def lr_diago(i, j):
    ans = False
    # 왼쪽 아래 대각선

    if arr[i][j] == 'o':
        a = cnt = 0
        while arr[i + a][j - a] == 'o' and 0 <= i + a < n and 0 <= j - a < n:
            cnt += 1
            a += 1

            if cnt == 5:
                ans = True
                return ans

            if i + a >= n or j - a < 0:
                break

    return ans


def garo_sero(i, j):
    ans = False

    # 가로, 세로
    s_cnt = g_cnt = 0
    a = 0
    while arr[i][j + a] == 'o':
        g_cnt += 1
        a += 1

        if g_cnt == 5:
            ans = True
            return ans
        if j + a >= n:
            break

    a = 0
    while arr[j + a][i] == 'o':
        s_cnt += 1
        a += 1

        if s_cnt == 5:
            ans = True
            return ans

        if j + a >= n:
            break

    return ans


for k in range(1, t + 1):

    n = int(input())
    arr = [list(input()) for _ in range(n)]
    ans = False

    for i in range(n):
        for j in range(n):
            if arr[i][j] == 'o' and rl_digo(i, j) or lr_diago(i, j) or garo_sero(i, j):
            	ans = True
            	break

    if ans:
        print(f"#{k} YES")

    else:
        print(f"#{k} NO")