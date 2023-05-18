
t = int(input())
code = {'0001101': 0, '0011001': 1, '0010011': 2, '0111101': 3, '0100011': 4,
        '0110001': 5, '0101111': 6, '0111011': 7, '0110111': 8, '0001011': 9}

for i in range(1, t + 1):

    n, m = map(int, input().split())
    arr = [list(input()) for _ in range(n)]
    x, y = 0, 0

    num = ""
    for a in range(n):
        for b in range(m):
            if arr[a][b] == '1':
                x, y = a, b
                break

    one_cnt = arr[x].count('1')

    for b in range(y, m):
        num += arr[x][b]
        if num.count('1') == one_cnt:
            break

    while len(num) != 56:
        num = "0" + num

    idx = result = total = 0
    for a in range(0, 56, 7):
        binary_num = ""
        idx += 1
        for b in range(a, a + 7):
            binary_num += num[b]

        if idx % 2:  # 홀수 자리일 경우
            result += (code[binary_num] * 3)
        else:
            result += code[binary_num]
        total += code[binary_num]

    if result % 10 == 0: # 10의 배수일 경우
        print(f"#{i} {total}")
    else:
        print(f"#{i} {0}")