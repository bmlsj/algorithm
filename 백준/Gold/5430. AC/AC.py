from collections import deque
import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):

    comment = list(input())

    n = int(input())
    arr = deque(input().rstrip()[1:-1].split(","))
    check = True
    r_cnt = 0

    if n == 0:
        arr = []

    for i in comment:
        # R이 홀수일때만 뒤집음
        if i == 'R':
            r_cnt += 1
        elif i == 'D':
            if len(arr) <= 0:
                print("error")
                check = False
                break
            else:
                if r_cnt % 2 == 0:
                    arr.popleft()
                else:
                    arr.pop()

    if check:
        if r_cnt % 2 == 0:
            print("["+",".join(arr)+"]")
        else:
            arr.reverse()
            print("[" + ",".join(arr) + "]")