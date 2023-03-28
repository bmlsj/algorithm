import sys

num = int(sys.stdin.readline())

queue = []
arr = [input() for _ in range(num)]

for s in arr:
    if "push" in s:
        a, b = s.split(" ")
        queue.append(b)

    elif s == "front":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])
    elif s == "back":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[-1])
    elif s == "size":
        print(len(queue))
    elif s == "empty":
        if len(queue) != 0:
            print(0)
        else:
            print(1)
    elif s == "pop":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue.pop(0))
