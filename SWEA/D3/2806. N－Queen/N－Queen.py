
T = int(input())

for i in range(1, T+1):
    n = int(input())
    cnt = 0
    isused_col = [0] * (n + 1)  
    isused_dia1 = [0] * (2 * n) 
    isused_dia2 = [0] * (2 * n) 

    def func(curr):
        global cnt
        if curr == n:  # 퀸 n개를 놓는데 성공
            cnt += 1
            return

        for i in range(n):
            if isused_col[i] or isused_dia1[i + curr] or isused_dia2[curr - i + (n - 1)]:
                continue

            isused_col[i] = True
            isused_dia1[i + curr] = True
            isused_dia2[curr - i + n - 1] = True

            func(curr + 1)
            isused_col[i] = False
            isused_dia1[i + curr] = False
            isused_dia2[curr - i + n - 1] = False


    func(0)
    print(f"#{i} {cnt}")