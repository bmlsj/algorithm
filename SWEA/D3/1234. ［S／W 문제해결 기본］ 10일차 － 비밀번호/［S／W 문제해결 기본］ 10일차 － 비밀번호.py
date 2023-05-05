
for i in range(1, 11):

    n, pw = input().split()
    stack = [pw[0]]

    for j in range(1, int(n)):
        if len(stack) and stack[-1] == pw[j]:
            stack.pop()
        else:
            stack.append(pw[j])

    print(f"#{i} {''.join(map(str, stack))}")
