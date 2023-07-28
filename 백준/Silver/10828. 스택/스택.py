import sys

input = sys.stdin.readline

n = int(input())
stack = []

for _ in range(n):

    comment = input()
    if "push" in comment:
        push, num = comment.split()
        stack.append(int(num))

    elif "pop" in comment:
        if len(stack) == 0:
            print("-1")
        else:
            print(stack.pop())

    elif "size" in comment:
        print(len(stack))

    elif "empty" in comment:
        if len(stack) != 0:
            print(0)
        else:
            print(1)
    elif "top" in comment:
        if len(stack) != 0:
            print(stack[-1])
        else:
            print(-1)
