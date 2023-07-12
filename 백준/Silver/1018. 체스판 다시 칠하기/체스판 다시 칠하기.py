N, M = map(int, input().split())
original = [input() for _ in range(N)]
count = []

# 8x8로 자름
for a in range(N - 7):
    for b in range(M - 7):
        w_idx = 0  # 흰색으로 시작할 경우
        b_idx = 0  # 검은색으로 시작할 경우
        for i in range(a, a + 8):
            for j in range(b, b + 8):
                # 짝수인 경우
                if (i + j) % 2 == 0:
                    # 'B'일 경우
                    if original[i][j] != 'W':
                        w_idx += 1   # 'W'로 칠해야 하는 횟수
                    # W일 경우
                    if original[i][j] != 'B':
                        b_idx += 1   # 'B'로 칠해야 하는 횟수
                else: # 홀수인 경우
                    # 'B'일 경우
                    if original[i][j] != 'B':
                        w_idx += 1  # 'W'로 칠해야 함
                    # 'W'일 경우
                    if original[i][j] != 'W':
                        b_idx += 1  # 'B'로 칠해야 함

        count.append(min(w_idx, b_idx))

print(min(count))