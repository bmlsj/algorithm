def solution(s):
    stack = []

    for i in s:
        if len(stack) and (stack[-1] == i):
            stack.pop()
        else:
            stack.append(i)

    return 0 if len(stack) else 1