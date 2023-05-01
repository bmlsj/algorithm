for i in range(1, 11):

    n = int(input())
    arr = [list(input().split()) for _ in range(n)]
    cnt = 0

    for j in range(n):
        r = 0
        stack = []
        while r < n:
            if not stack and arr[r][j] == '1':
                stack.append('1')
            elif stack and arr[r][j] == '2':
                cnt += int(stack.pop())
            r += 1

    print("#{} {}".format(i, cnt))