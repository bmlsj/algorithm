


# cnt는 몇 번 바꿨는 지
def dfs(cnt):
    global result

    # 횟수를 다 사용했다면
    if not cnt:
        # str -> int로 변경
        tmp = int(''.join(values))

        # 가지고 있는 최대 수보다 크면 갱신
        if result < tmp:
            result = tmp
        return

    for i in range(length):
        for j in range(i+1, length):

            values[i], values[j] = values[j], values[i]
            tmp_key = ''.join(values)

            if visited.get((tmp_key, cnt-1), 1):
                visited[(tmp_key, cnt-1)] = 0
                dfs(cnt-1)

            values[i], values[j] = values[j], values[i]

for t in range(int(input())):
    result = -1
    value, change = input().split()

    values = list(value)
    change = int(change)
    length = len(values)

    visited = {}
    dfs(change)
    print("#{} {}".format(t+1, result))