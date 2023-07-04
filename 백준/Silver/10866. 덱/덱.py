from collections import deque
import sys
input = sys.stdin.readline

que = deque()

for _ in range(int(input())):

    comment = list(input().split())

    if comment[0] == 'push_front':
        que.appendleft(comment[1])
    elif comment[0] == 'push_back':
        que.append(comment[1])
    elif comment[0] == 'pop_front':
        if len(que):
            print(que.popleft())
        else:
            print(-1)
    elif comment[0] == 'pop_back':
        if len(que):
            print(que.pop())
        else:
            print(-1)
    elif comment[0] == 'size':
        print(len(que))
    elif comment[0] == 'empty':
        if len(que):
            print(0)
        else:
            print(1)
    elif comment[0] == 'front':
        if len(que):
            print(que[0])
        else:
            print(-1)
    elif comment[0] == 'back':
        if len(que):
            print(que[-1])
        else:
            print(-1)